import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;

class Indoor1 extends JFrame implements ActionListener
 {
  
  public Indoor1() 
  {
  	super("INDOOR");
  	JButton bok;

    setSize(600, 400);

    JTable jt = new JTable(new String[][] { 
                               {"01", "DRESSINA","100"},
                               {"02", "PETRA","120"},
                               {"03","ESPA GRASS","70"}, 
                               {"04","DYEFERN","90"},
                               {"05","CELLUM","400"},
                               {"06","STEPLERRA","120"},
                               {"07","ELPINA","150"},
                               {"08","ZEBRINA","110"}},
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
    Indoor1 i = new Indoor1();
    i.setVisible(true);
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
