import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class UserLogin extends JFrame implements ActionListener
{
	JLabel L1,L2,L3;
	TextField TF1;
	TextField TF2;
	JButton B1,B2;
	JPanel P1,P2,P3;
	
	public UserLogin()
	{
		Container C=getContentPane();
	     C.setLayout(null);
	    //C.setBackground(new Color(250,200,255));
		 
		
		JPanel P1=new JPanel();
		P1.setLayout(null);
		P1.setBackground(new Color(204,204,250));
		P1.setBorder(new LineBorder(new Color(250,50,0),3));
		P1.setBounds(50,50,500,300);
		
		JLabel L1=new JLabel();
		L1.setFont(new Font("Arial",20,30));
		L1.setForeground( Color.black);
	//	L1.setForeground(new Color(50,10,150));
		L1.setText(" WELCOME TO  OM SAI NURSERY ");
	    C.add(L1);
		L1.setBounds(50,50,800,50);
		 /*L1=new JLabel(new ImageIcon("flowers/11.jpg"));
		L1.setSize(700,650);
		C.add(L1);*/
		
	    L2=new JLabel();
		L2.setFont(new Font("Arial",10,20));
		L2.setForeground( new Color(50,10,150));
		L2.setText("PASSWORD  :: ");
		C.add(L2);
		L2.setBounds(100,290,200,50);
		
		L3=new JLabel();
		L3.setFont(new Font("Arial",10,20));
		L3.setForeground(new Color(50,10,150));
		L3.setText("LOGIN ::      ");
		C.add(L3);
		L3.setBounds(100,140,200,150);
		
		TF1=new TextField();
		P1.add(TF1);
	   //TF1.setToolTipText("ENTER THE PASSWORD");
		TF1.setBounds(250,250,150,25);
		TF1.setEchoChar('*');
		C.add(P1);
		
		TF2=new TextField();
		P1.add(TF2);
	    //TF2.setToolTipText("ENTER THE SERVICE NO");
		TF2.setBounds(250,150,150,25);
					
		JPanel P2=new JPanel();
		P2.setLayout(null);
		P2.setBackground(new Color(204,204,255));
		P2.setBorder(new LineBorder(new Color(250,50,0),3));
		P2.setBounds(100,400,400,75);
		
		B1=new JButton("O.K.");
		B1.setFont(new Font("Arial",1,20));
		B1.addActionListener(this);
		P2.add(B1);
		B1.setBounds(80,25,100,30);
				
		B2=new JButton("EXIT");
		B2.setFont(new Font("Arial",1,20));
		B2.addActionListener(this);
		P2.add(B2);
		B2.setBounds(220,25,100,30);
		
		C.add(P2);
		
		setTitle("User Login Window");
		setBackground(new Color(50,150,20));
	}//userlogin
	
	public void actionPerformed(ActionEvent e)
	{
		//String s=e.getActionCommand();
		
		if(e.getSource()==B1)
		{
			if((TF1.getText().equals("admin"))&&(TF2.getText().equals("admin")))
                                          
	                            {
	                            dispose();	
	                               home h=new home();
	                               h.setVisible(true);
	                               	                               
	                            }   
	               else
	                 {
	        	      JOptionPane.showMessageDialog(null,"ENTER THE CORRECT PASSWORD AND SERVICE NO");
	        	
	                 }   
	           }
		
		if(e.getSource()==B2)
		{
			System.exit(0);
		}
	}
	 
	 public static void main(String args[])
	 	 {
	 	UserLogin l=new UserLogin();
	 	l.setSize(650,650);
	 	l.setVisible(true);
	  	
	 	
	 }
}  