package sm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class searchby extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchby frame = new searchby();
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
	public searchby() {
		setTitle("searchBy");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 331, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSearchby = new JLabel("searchBy");
		String values[]={"select","all","author","publisher","category","subject"};
		JComboBox comboBox = new JComboBox(values);
		
		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value=(String)comboBox.getSelectedItem();
				if(value.equalsIgnoreCase("select"))
				{JOptionPane.showMessageDialog(getParent(),"select a value","Error",JOptionPane.ERROR_MESSAGE);
			}
		       if(value.equalsIgnoreCase("all"))
		       {
		    	   JFrame frm=new JFrame();
		    	   frm.setSize(900,400);
		    	   frm.setLocationRelativeTo(frm);
                   frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                   DBInfo.getAllBooks();
                   JTable t=new JTable(DBInfo.outer,DBInfo.header);
                   JScrollPane pane=new JScrollPane(t);
                   frm.add(pane);
                   frm.setVisible(true);
		       }
		       else
		       {
		    	   String name=JOptionPane.showInputDialog("Enter"+value+"name");
		    	   System.out.println(value+";;;;;"+name);
		    	   JFrame frm=new JFrame();
		    	   frm.setSize(900,400);
		    	   frm.setLocationRelativeTo(frm);
                   frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                   DBInfo.getvalues1(value,name);
                   JTable t=new JTable(DBInfo.outer,DBInfo.header);
                   JScrollPane pane=new JScrollPane(t);
                   frm.add(pane);
                   frm.setVisible(true);
		       
                   
                  
		       }
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(49)
							.addComponent(lblSearchby)
							.addGap(37)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(106)
							.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(93, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSearchby))
					.addGap(45)
					.addComponent(btnSearch)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
