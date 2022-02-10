import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class Lab extends JFrame implements ActionListener
{
  JPanel p;
  JLabel l1,l2;
  JButton b1,b2,b3,b4,b5;
public Lab()
{
   super("PLANT LIBRARY");
   setVisible(true);
   setSize(600,400);
   setLocation(100,100);
   setResizable(false);
   p=new JPanel();
   p.setLayout(null);
   p.setBackground(new Color(250,200,255));
   getContentPane().add(p);
   l1=new JLabel("OM SAI NURSERY");
   l2=new JLabel("PLANT LIBRARY");
   
   b1=new JButton("INDOOR");
   b2=new JButton("OUTDOOR ");
   b3=new JButton("SEMISET");
   b4=new JButton("FRUITS");
   b5=new JButton("BACK");
      
    Font f=new Font("Monotype Corsiva",Font.BOLD,30);
    l1.setFont( f );
    l1.setForeground(Color.red);
    
    l2.setFont(f);
    l2.setForeground(Color.blue);
    
    p.add(l1);
    l1.setBounds(100,15,380,60);
    
    p.add(l2);
    l2.setBounds(140,70,380,60);
    
    p.add(b1);
    b1.setBounds(90,180,150,30);
    
    p.add(b2);
    b2.setBounds(320,180,150,30);
    
    p.add(b3);
    b3.setBounds(90,250,150,30);
    
    p.add(b4);
    b4.setBounds(320,250,150,30);
    
    p.add(b5);
    b5.setBounds(210,320,150,30);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
  }
public void actionPerformed(ActionEvent e)
{
   
  if(e.getSource()==b1)
  {
  	Indoor1 i=new Indoor1();
  	i.setVisible(true);
  }	
  if(e.getSource()==b2)
  {
  	Outdoor o=new Outdoor();
  	o.setVisible(true);
  }	
  if(e.getSource()==b3)
  {
  	Semiset s=new Semiset();
  	s.setVisible(true);
  }	
  if(e.getSource()==b4)
  {
  	Fruit f=new Fruit();
  	f.setVisible(true);
  }	
  if(e.getSource()==b5)
  
     {
       
       pdetail p=new pdetail();
        p.setVisible(true);
        dispose();
      }
   }
public static void main(String args[])
{
      Lab l1=new Lab();
      l1.show();
     
}
} 




