import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
class RepWin extends JFrame implements ActionListener
{
	JButton RWLabB,RWStockB,RWBackB;
	 JLabel l2,l;
	 Icon img;
	public RepWin()
	{
		super("Report Window");
		RWStockB=new JButton();
		RWLabB=new JButton();
		RWBackB=new JButton();
		l=new JLabel();
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(250,200,255));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		img=new ImageIcon("c:\\program files\\java\\jdk1.5.0\\bin\\project1\\flowers\\500.gif");
       l2=new JLabel(img); 
       l2.setBounds(10,60,570,320);
        getContentPane().add(l2);
        
        l.setFont(new Font("Monotype Corsiva",Font.BOLD, 30));
//l.setForeground(new Color(200,40,0));
      l.setForeground(Color.blue);
      l.setText("OM SAI NURSERY");
      l.setHorizontalTextPosition(SwingConstants.CENTER);
      getContentPane().add(l);
      l.setBounds(100, 10, 350, 50);

		RWStockB.setFont(new Font("Arial",1,16));
		RWStockB.setText("PURCHASE REPORT");
		RWStockB.setBorder(new LineBorder(new Color(0,0,0)));
		getContentPane().add(RWStockB);
		RWStockB.setBounds(40,410,200,40);
        RWStockB.addActionListener(this);
        RWLabB.setFont(new Font("Arial",1,16));
		RWLabB.setText("SALE REPORT");
		RWLabB.setBorder(new LineBorder(new Color(0,0,0)));
		getContentPane().add(RWLabB);
		RWLabB.setBounds(300,410,200,40);
		RWLabB.addActionListener(this);
	    RWBackB.setFont(new Font("Arial",1,16));
		RWBackB.setText("HOME");
		RWBackB.setBorder(new LineBorder(new Color(0,0,0)));
		getContentPane().add(RWBackB);
		RWBackB.setBounds(170,500,200,40);
		RWBackB.addActionListener(this);
	    //setVisible(true);
	    setSize(600,600);
	  }
	  public void actionPerformed(ActionEvent e)
	  {
	  	String str;
	  	str=e.getActionCommand();
	  	if(e.getSource()==RWBackB)
	  	
	  	{
	  		dispose();
	  		home h=new home();
	  	}
	  	if(e.getSource()==RWStockB)
	  	{
	  		Frame_1 f=new Frame_1();
	  		f.setVisible(true);
	  }
	  	if(e.getSource()==RWLabB)
	  	{
	  		Frame_2 f2=new Frame_2();
	  		f2.setVisible(true);
	  	}
	  }		
public static void main(String args[])
    {
     RepWin r1=new RepWin();
      r1.show();
       r1.setDefaultCloseOperation(r1.EXIT_ON_CLOSE);
   }
}	  				  