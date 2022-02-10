import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import javax.swing.table.*;
import java.sql.*;

public class Frame_1 extends JFrame implements ActionListener {
	Connection con;
	Statement stmt;
	ResultSet rs, resultt1;
	boolean flag = false;
	boolean flag1 = false;
	JPanel p1, p2, p3, p4, p5;
	JButton b1, b3, b4, b5, b6, b7;
	JLabel dt, l1, l2, l3, l5, l, l4;
	JTextField dt1, tf1, tf2, tf3, tf4, tf5, t;
	JTextArea ta1;

	public Frame_1() {
		l = new JLabel("OM SAI REPORT");
		p3 = new JPanel();
		l1 = new JLabel("PLANT  NAME");
		dt = new JLabel("Date   :");
		dt1 = new JTextField();
		p1 = new JPanel();
		l2 = new JLabel("SEARCH FOR  ");
		l3 = new JLabel("  ENTER THE DATE:     :");
		tf3 = new JTextField();
		t = new JTextField();
		tf4 = new JTextField();
		p2 = new JPanel();
		l4 = new JLabel("NO. OF PLANTS");
		tf5 = new JTextField();
		p4 = new JPanel();
		b1 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		tf3 = new JTextField();
		p5 = new JPanel();
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		l.setFont(new Font("Arial", 1, 24));
		l.setForeground(new Color(51, 51, 225));
		l.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(l);
		l.setBounds(300, 10, 250, 30);
		p3.setLayout(null);
		dt.setFont(new Font("Arial", 0, 14));
		p3.add(dt);
		dt.setBounds(10, 0, 60, 20);
		dt1.setFont(new Font("Arial", 0, 13));
		p3.add(dt1);
		dt1.setBorder(new LineBorder(new Color(0, 0, 0)));
		dt1.setBounds(60, 0, 80, 17);
		contentPane.add(p3);
		p3.setBounds(30, 30, 250, 30);
		p1.setLayout(null);
		p1.setBackground(new Color(204, 204, 255));
		p1.setFont(new Font("Arial", 1, 14));
		p1.setForeground(new Color(51, 51, 51));
		p1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		p1.setBounds(30, 70, 370, 310);
		l2.setFont(new Font("Arial", 0, 22));
		l2.setForeground(new Color(255, 51, 51));
		p1.add(l2);
		l1.setFont(new Font("Arial", 0, 13));
		l1.setBounds(15, 150, 180, 20);
		p1.add(l1);
		l3.setFont(new Font("Arial", 0, 13));
		p1.add(l3);
		l3.setBounds(10, 100, 180, 20);
		p1.add(t);
		t.setFont(new Font("Arial", 0, 12));
		t.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1.add(t);
		t.setBounds(150, 150, 190, 20);
		p1.add(tf4);
		tf4.setFont(new Font("Arial", 0, 12));
		tf4.setBorder(new LineBorder(new Color(0, 0, 0)));
		p1.add(tf4);
		tf4.setBounds(150, 100, 190, 20);
		contentPane.add(p1);
		p1.setBounds(30, 70, 370, 310);
		p2.setLayout(null);
		p2.setBackground(new Color(204, 204, 255));
		p2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		l4.setFont(new Font("Arial", 0, 22));
		l4.setBackground(new Color(255, 51, 51));
		p2.add(l4);
		l4.setBounds(90, 20, 170, 19);
		tf5.setFont(new Font("Arial", 0, 12));
		tf5.setBorder(new LineBorder(new Color(0, 0, 0)));
		p2.add(tf5);
		tf5.setBounds(110, 80, 120, 80);
		b4.setFont(new Font("Arial", 0, 12));
		b4.setText("SEARCH");
		b4.setForeground(new Color(255, 51, 51));
		b4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p2.add(b4);
		b4.addActionListener(this);
		b4.setBounds(130, 250, 80, 40);
		contentPane.add(p2);
		p2.setBounds(420, 70, 370, 310);
		p5.setLayout(null);
		p5.setBackground(new Color(204, 204, 255));
		p5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		p5.setForeground(new Color(51, 51, 51));
		contentPane.add(p5);
		p5.setBounds(160, 410, 400, 60);
		b1.setFont(new Font("Arial", 0, 12));
		b1.setText("NEW");
		b1.setMnemonic('n');
		b1.addActionListener(this);
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p5.add(b1);
		b3.addActionListener(this);
		b1.setBounds(200, 20, 80, 30);
		b6.setFont(new Font("Arial", 0, 12));
		b6.setText("BACK");
		b6.setMnemonic('b');
		b6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p5.add(b6);
		b6.addActionListener(this);
		b6.setBounds(80, 20, 80, 30);
		setVisible(true);
		setSize(800, 800);
		Calendar cal = Calendar.getInstance();
		dt1.setText((cal.get(Calendar.DATE)) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + (cal.get(Calendar.YEAR)));
		dt1.setEditable(false);
	}

	void exitForm(WindowEvent evt) {
		System.exit(0);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b6) {
			dispose();
			RepWin j = new RepWin();
			j.setVisible(true);
		}
		if (e.getSource() == b1) {

			tf4.setText("");
			tf3.setText("");
			tf5.setText("");
		}
		if (e.getSource() == b4) {
			String categary = tf3.getText();
			if (categary.equals("")) {
				try

				{

					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nms?useSSL=false", "root", "root");
					Statement s1 = con.createStatement();
					ResultSet r1 = s1.executeQuery("select sum(p_qty) from purchase where p_date='" + tf4.getText()
							+ "' and p_name='" + t.getText() + "'");
					r1.next();
					tf5.setFont(new Font("Arial", 0, 56));
					int i1 = r1.getInt(1);
					tf5.setText(i1 + "");
				} catch (Exception e1) {
				}
			}
		}
	}

	public static void main(String args[]) {
		Frame_1 d = new Frame_1();
		d.show();
		d.setDefaultCloseOperation(d.EXIT_ON_CLOSE);
	}

}