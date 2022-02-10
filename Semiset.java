import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class Semiset extends JFrame implements ActionListener
 {

  public Semiset() 
  {
  	super("SEMISET");
  	JButton bok;
  
    
    setSize(600, 400);
   // addWindowListener(new BasicWindowMonitor());

    JTable jt = new JTable(new String[][] { 
                               {"25", "JERBERA","120"},
                               {"26", "DAISY","150"},
                               {"27","BALSAM","370"}, 
                               {"28","COLIUS","250"}},
                           new String[] {"PLANT_NO", "PLANT_NAME","RATE"});
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
    Semiset s = new Semiset();
    s.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  {
  	    String str;
    	str=ae.getActionCommand();
        if(str.equals("BACK"))
          {
    	    	dispose();	
                Lab l1=new Lab();
                l1.setVisible(true);
    	  }
		
  }
}
