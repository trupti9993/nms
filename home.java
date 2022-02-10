
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;

class home extends JFrame implements ActionListener {
	JPanel p1, p2, p3, p4;
	JButton b1, b2, b3, b4, b5;
	JLabel l1, l2;
	Menu m1, m2, m3, m4;
	MenuBar mb;
	MenuItem i1, i2, i3, i4, i5, i6, i7, i8;
	Icon img;

	public home() {
		super("Main Window");
		p1 = new JPanel();
		p2 = new JPanel();
		p4 = new JPanel();

		img = new ImageIcon("c:\\program files\\java\\jdk1.5.0\\bin\\project1\\flowers\\501.gif");
		l2 = new JLabel(img);
		l2.setBounds(10, 100, 480, 310);
		p1.add(l2);
		b1 = new JButton("STOCK");
		b2 = new JButton("PURCHASE");
		b3 = new JButton("SALE");
		b4 = new JButton("REPORT");
		b5 = new JButton("CLOSE");

		mb = new MenuBar();
		m1 = new Menu("PLANT");
		m2 = new Menu("MAINTAINANCE");
		i6 = new MenuItem("INFORMATION");
		m3 = new Menu("CUSTOMER");
		i7 = new MenuItem("CUSTOMER ISSUE");
		i8 = new MenuItem("CUSTOMER RECIEVE");
		i1 = new MenuItem("PLANT DETAILS");
		m4 = new Menu("BILL");
		i3 = new MenuItem("FOR SALE");
		i4 = new MenuItem("FOR RENT");
		i5 = new MenuItem("EXIT");

		i1.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);
		i8.addActionListener(this);
		m1.add(i1);
		m1.add(m4);
		m4.add(i3);
		m4.add(i4);
		m1.addSeparator();
		m1.add(i5);
		m1.addSeparator();
		m2.addActionListener(this);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		m2.add(i6);
		m3.add(i7);
		m3.add(i8);

		setMenuBar(mb);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});

		Container contentPane = getContentPane();
		getContentPane().setLayout(null);

		p2.setBackground(new Color(190, 170, 255));
		p2.setLayout(null);
		contentPane.add(p2);
		p2.setBounds(500, 125, 230, 260);
		p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

		p4.setBackground(new Color(170, 30, 0));
		p4.setLayout(null);
		contentPane.add(p4);
		p4.setBounds(150, 20, 380, 50);

		p1.setBackground(new Color(240, 170, 255));
		p1.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.add(p1);
		p1.setBounds(0, 0, 800, 575);

		l1 = new JLabel("  OM SAI NURSERY ", JLabel.CENTER);

		b1.setFont(new Font("Arial", 0, 18));
		b1.setMnemonic('a');
		b1.setForeground(new Color(255, 51, 51));
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p1.add(b5);
		p2.add(b1);
		b1.addActionListener(this);
		b1.setBounds(20, 20, 180, 40);

		b2.setFont(new Font("Arial", 0, 18));
		// b2.setMnemonic('a');
		b2.setForeground(new Color(255, 51, 51));
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p1.add(b5);
		p2.add(b2);
		b2.addActionListener(this);
		b2.setBounds(20, 180, 180, 40);

		b3.setFont(new Font("Arial", 0, 18));
		// b3.setMnemonic('a');
		b3.setForeground(new Color(255, 51, 51));
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p1.add(b5);
		p2.add(b3);
		b3.addActionListener(this);
		b3.setBounds(20, 100, 180, 40);

		b4.setFont(new Font("Arial", 0, 18));
		// b4.setMnemonic('r');
		b4.setForeground(new Color(255, 51, 51));
		b4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p1.add(b4);
		p1.add(b4);
		b4.addActionListener(this);
		b4.setBounds(100, 440, 120, 40);

		b5.setFont(new Font("Arial", 0, 18));
		// b5.setMnemonic('b');
		b5.setForeground(new Color(255, 51, 51));
		b5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p1.add(b5);
		b5.addActionListener(this);
		b5.setBounds(290, 440, 120, 40);

		Font f = new Font("Charlemagne", Font.BOLD, 25);
		l1.setFont(f);
		l1.setForeground(Color.white);
		p4.add(l1);
		l1.setBounds(10, 5, 330, 40);
		setSize(800, 575);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			dispose();
			stock s = new stock();
			s.setVisible(true);
		}
		if (e.getSource() == b2) {
			dispose();
			Purchase p = new Purchase();
			p.setSize(750, 650);
			p.setVisible(true);
		}
		if (e.getSource() == b3) {
			dispose();
			sale s1 = new sale();
			s1.setVisible(true);
		}
		if (e.getSource() == b4) {
			dispose();
			RepWin r = new RepWin();
			r.setVisible(true);
		}
		if (e.getSource() == b5) {
			dispose();
		}
		if (e.getSource() == i6) {
			dispose();
			Maint m = new Maint();
			m.setVisible(true);
		}
		if (e.getSource() == i1) {
			dispose();
			pdetail d1 = new pdetail();
			d1.setVisible(true);
		}
		if (e.getSource() == i3) {
			dispose();
			Bill1 b = new Bill1();
			b.setVisible(true);
		}

		if (e.getSource() == i7) {
			dispose();
			customer c1 = new customer();
			c1.setVisible(true);
		}
		if (e.getSource() == i8) {
			dispose();
			customer1 c1 = new customer1();
			c1.setVisible(true);
		}
		if (e.getSource() == i4) {
			dispose();
			Rbill s = new Rbill();
		}
		if (e.getSource() == i5) {
			dispose();
			setVisible(false);
		}
	}

	public static void main(String args[]) {
		home h = new home();
		h.show();
		h.setDefaultCloseOperation(h.EXIT_ON_CLOSE);
	}
}