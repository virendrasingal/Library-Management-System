package sm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Font;

public class login1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login1 frame = new login1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login1() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.ORANGE);
		JLabel lblName = new JLabel("ENTER YOUR NAME");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("ENTER YOUR PASSWORD");
		
		passwordField = new JPasswordField();
		
		JButton btnLogMiIn = new JButton("LOGIN NOW");
		btnLogMiIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{   int i = 0;
			String usertype = null;
				String s1=textField.getText();
				char ch[]=passwordField.getPassword();
				String s2=String.copyValueOf(ch);
				String query="select * from login where name=? and password=?";
				Connection con=DBInfo.con;
				try
				{
					 PreparedStatement ps=con.prepareStatement(query);
					 ps.setString(1,s1);
					 ps.setString(2,s2);
					 ResultSet res=ps.executeQuery();
					 while(res.next())
					 {
						  i=1;
						  usertype = res.getString(3);
					//	  System.out.println(usertype);
						  break;
						  
						  
					 }
					 
				}
				catch(Exception e1)
				{
					 e1.printStackTrace();
					 
				}
				if(i==1&&usertype.equalsIgnoreCase("admin"))
				{ //System.out.println(i);
					 Admin ad=new Admin();
					 ad.setVisible(true);
					 //dispose();
					 
				}
				if(i==1&&usertype.equalsIgnoreCase("student"))
				{ //System.out.println(i);
					 Student sd=new Student();
					 sd.setVisible(true);
					 //dispose();
					 
				}
				
				if(i==0)
					JOptionPane.showMessageDialog(getParent(), "User is not available!!");
			}
		});
		
		JLabel label = new JLabel(new ImageIcon("D:\\java Programming\\java\\Institute1\\Demo\\login.png"));
		
		JLabel lblLibraryManagementSystem = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		lblLibraryManagementSystem.setFont(new Font("GungsuhChe", Font.PLAIN, 25));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(label)
								.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblPassword)
										.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblName)
										.addGap(74)
										.addComponent(textField)))
								.addContainerGap(57, Short.MAX_VALUE))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(btnLogMiIn)
								.addGap(175)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblLibraryManagementSystem)
							.addGap(90))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibraryManagementSystem)
					.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(btnLogMiIn)
					.addGap(44))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addComponent(label)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
