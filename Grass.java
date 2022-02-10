import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Grass extends JFrame implements ActionListener
 {

  public Grass() 
  {
  	super("OTHER");
  	JButton bok;
  //	JPanel pan1,pan2;
  	
    
    setSize(600, 400);
   // addWindowListener(new BasicWindowMonitor());

    JTable jt = new JTable(new String[][] { 
                             {"WATERLILLY","150"},
                              {"BORDER OF ROAD", "200"},
                               {"LAWN GRASS","200"} },
                           new String[] {"TYPE", "RATE"});
    JScrollPane jsp = new JScrollPane(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);
    
    bok=new JButton("BACK");
    bok.setToolTipText("Click Here ToGo MainWinDow");
    bok.setSize(10,30);
    bok.setBounds(250, 150, 100, 20);
    JScrollPane jsp1 = new JScrollPane(bok);
    bok.addActionListener(this);
    getContentPane().add(jsp1, BorderLayout.SOUTH);
    
  }

  public static void main(String args[]) {
    Grass g = new Grass();
    g.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  {
  	    String str;
    	str=ae.getActionCommand();
        if(str.equals("BACK"))
          {
    	    	dispose();	
                pdetail fm=new pdetail();
                fm.setVisible(true);
    	  }
		
  }
}
