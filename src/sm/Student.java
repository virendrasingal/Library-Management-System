package sm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 629, 388);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 4, 0, 0));
		
		JButton btnSearchBook = new JButton("search update delete book");
		
		contentPane.add(btnSearchBook);
		
		JButton btnSearchById = new JButton("search by");
		btnSearchById.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchby se=new searchby();
				se.setVisible(true);
			}
		});
		
		contentPane.add(btnSearchById);
		
		JButton btnAddNewBook = new JButton("add new book");
	
		contentPane.add(btnAddNewBook);
		
		JButton btnIssueBook = new JButton("issue book");
		
		contentPane.add(btnIssueBook);
		
		JButton btnSubmitBook = new JButton("submit book");
	
		contentPane.add(btnSubmitBook);
		
		JButton btnAddNewUser = new JButton("add new user");
	
		contentPane.add(btnAddNewUser);
		
		JButton btnDeleteUser = new JButton("delete user");
		
		contentPane.add(btnDeleteUser);
		
		//JButton btnCheckFine = new JButton("check fine");
		//contentPane.add(btnCheckFine);
		
		JButton btnChangeSelfPassword = new JButton("change self password");
		btnChangeSelfPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changepass cp=new changepass();
				cp.setVisible(true);
			}
		});
		
		contentPane.add(btnChangeSelfPassword);
		
		JButton btnUpdatedeleteBook = new JButton("update/delete book");
		contentPane.add(btnUpdatedeleteBook);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton);
		
		//JButton btnNewButton_1 = new JButton("New button");
		//contentPane.add(btnNewButton_1);
	}

}
