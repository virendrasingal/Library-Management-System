package sm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultLookAndFeelDecorated(false);
		setSize(getToolkit().getScreenSize());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 4, 0, 0));
		
		JButton btnSearchBook = new JButton(new ImageIcon("search.png"));
		btnSearchBook.setBackground(Color.GRAY);
		btnSearchBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchupdate sw=new searchupdate();
				sw.setVisible(true);
			}
		});
		contentPane.add(btnSearchBook);
		
		JButton btnSearchById = new JButton(new ImageIcon("cat.jpg"));
		btnSearchById.setBackground(Color.PINK);
		btnSearchById.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchby sb=new searchby();
				sb.setVisible(true);
				
			}
		});
		contentPane.add(btnSearchById);
		
		JButton btnAddNewBook = new JButton(new ImageIcon("new.png"));
		btnAddNewBook.setBackground(Color.CYAN);
		btnAddNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addnewBook ab=new addnewBook();
				ab.setVisible(true);
			}
		});
		contentPane.add(btnAddNewBook);
		
		JButton btnIssueBook = new JButton(new ImageIcon("issue.jpg"));
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				issuebook ub=new issuebook();
				ub.setVisible(true);
			}
		});
		contentPane.add(btnIssueBook);
		
		JButton btnSubmitBook = new JButton(new ImageIcon("Submit.jpg"));
		btnSubmitBook.setBackground(Color.RED);
		btnSubmitBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitbook s=new submitbook();
				s.setVisible(true);
			}
		});
		contentPane.add(btnSubmitBook);
		
		JButton btnAddNewUser = new JButton(new ImageIcon("add.jpg"));
		btnAddNewUser.setBackground(Color.MAGENTA);
		btnAddNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addnewuser a=new addnewuser();
				a.setVisible(true);
			}
		});
		contentPane.add(btnAddNewUser);
		
		JButton btnDeleteUser = new JButton(new ImageIcon("delete.png"));
		btnDeleteUser.setBackground(Color.ORANGE);
		btnDeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deleteuser d=new Deleteuser();
				d.setVisible(true);
			}
		});
		contentPane.add(btnDeleteUser);
		
		//JButton btnCheckFine = new JButton("check fine");
		//contentPane.add(btnCheckFine);
		
		JButton btnChangeSelfPassword = new JButton(new ImageIcon("cp.png"));
		btnChangeSelfPassword.setBackground(Color.YELLOW);
		btnChangeSelfPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changepass c=new changepass();
				c.setVisible(true);
			}
		});
		contentPane.add(btnChangeSelfPassword);
		
		JButton btnUpdatedeleteBook = new JButton(new ImageIcon("ak.jpg"));
		btnUpdatedeleteBook.setBackground(Color.DARK_GRAY);
		contentPane.add(btnUpdatedeleteBook);
		
		//JButton btnNewButton_1 = new JButton("New button");
		//contentPane.add(btnNewButton_1);
	}

}
