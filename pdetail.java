import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class pdetail extends JFrame implements ActionListener
{
  JPanel p;
  JLabel l1,l2;
   Icon img;
  JButton b1,b2,b3;
public pdetail()
{
   super("PLANT DETAILS");
   setVisible(true);
   setSize(520,280);
   setLocation(100,100);
   setResizable(false);
   p=new JPanel();
   p.setLayout(null);
   p.setBackground(new Color(250,200,255));
   getContentPane().add(p);
   
   img=new ImageIcon("c:\\program files\\java\\jdk1.5.0\\bin\\project1\\flowers\\505.gif");
       l2=new JLabel(img); 
       l2.setBounds(10,45,290,190);
       p.add(l2);
   l1=new JLabel("PLANT   DETAILS");
   b1=new JButton("PLANT  LIBRARY");
   b2=new JButton("OTHER ");
   b3=new JButton("HOME");
    Font f=new Font("Monotype Corsiva",Font.BOLD,30);
  l1.setFont( f );
   l1.setForeground(new Color(200,40,0));
    p.add(l1);
    l1.setBounds(120,5,320,40);
   p.add(b1);
   b1.setBounds(320,80,150,25);
  // b1.setForeground(new Color(255,51,51));
   p.add(b2);
   b2.setBounds(320,130,150,25);
   p.add(b3);
   b3.setBounds(320,180,150,25);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
  }
public void actionPerformed(ActionEvent e)
{
  if(e.getSource()==b1)
  {
  	Lab l1=new Lab();
  	l1.setVisible(true);
  }		
   
  if(e.getSource()==b2)
  {
  	Grass g=new Grass();
  	g.setVisible(true);
  }	
  if(e.getSource()==b3)
  
     {
       dispose(); 
         home h=new home();
         h.setVisible(true);
         
        
      }
   }
public static void main(String args[])
{
        pdetail pd=new pdetail();
      pd.show();
  // pd.setDefaultCloseOperation(pd.EXIT_ON_CLOSE);
}
} 




