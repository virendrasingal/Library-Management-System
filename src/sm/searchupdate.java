package sm;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sm.DBInfo;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class searchupdate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JComboBox comboBox,comboBox_1,comboBox_2,comboBox_3;

	/**
	 * Launch the application.
	 */
	 public String bookId()
		{
			String id=" ";
			for(int i=0;i<=6;i++)
			{
				id+=(int)(Math.random()*10);
			}
			return id;
		}
	 public void reset()
		{
		    
		    textField.setText(bookId());
		    textField_1.setText(null);
		    textField_2.setText(null);
		   // textField_3.setText(null);
		    //textField_4.setText(null);
		   comboBox.setSelectedIndex(0);
		    comboBox_1.setSelectedIndex(0);
		    comboBox_2.setSelectedIndex(0);
		    comboBox_3.setSelectedIndex(0);
		    
		    
		}
		

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchupdate frame = new searchupdate();
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
	public searchupdate() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 707, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddnewbook = new JLabel("Addnewbook");
		
		JLabel lblId = new JLabel("id");
		
		JLabel lblName = new JLabel("name");
		
		JLabel lblAuthor = new JLabel("author");
		
		
				textField = new JTextField();
		/*		textField.addFocusListener(new FocusAdapter() {
					String title,author,pub,sub,cat,isbn,price,qua;
					@Override
					public void focusLost(FocusEvent e)
					{
					

			
						int flag=0;
						String bid=textField.getText();
						String query="select * from book where id=?";
					     try
					     {
					      Connection con=DBInfo.con;
					      PreparedStatement ps=con.prepareStatement(query);
					      ps.setString(1, bid);;
					      ResultSet res=ps.executeQuery();
					     while(res.next())
					     {
					      flag=1;
					      title=res.getString(2);
					      author=res.getString(3);
					      pub=res.getString(4);
					      cat=res.getString(5);
					      sub=res.getString(6);
					      //isbn=res.getString(7);
					      price=res.getString(7);
					     // qua=res.getString(9);
					       
					     }
					      
					      
					     }
					     catch(Exception e1)
					     {
					    	 e1.printStackTrace();
					     }
					     if(flag==0)
					     {
					     
					    JOptionPane.showMessageDialog(getParent(), "No record found!");	  
					      }
					     else
					     {
					     textField_1.setText(title);
					    // textField_2.setText(isbn);
					     textField_2.setText(price);
					  //   textField_4.setText(qua);
					     comboBox.setSelectedItem(author);
					     comboBox_1.setSelectedItem(pub);
					     comboBox_2.setSelectedItem(cat);
					     comboBox_3.setSelectedItem(sub);
					     }
					
					}
				});*/
				//textField.setEditable(false);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox(DBInfo.getAuthor());
		
		JLabel lblPublisher = new JLabel("publisher");
		
		JComboBox comboBox_1 = new JComboBox(DBInfo.getPublisher());
		
		JLabel lblSubject = new JLabel("subject");
		
		JComboBox comboBox_2 = new JComboBox(DBInfo.getSubject());
		
		JLabel lblCategory = new JLabel("category");
		
		JComboBox comboBox_3 = new JComboBox(DBInfo.getCategory());
		
		JLabel lblPrice = new JLabel("price");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
	
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			

				{
				    
				 reset();
				
			}
		});
		
		JButton btnSave = new JButton("search");
		btnSave.addActionListener(new ActionListener() 
		{  String name,author,pub,sub,cat,price;
		public void actionPerformed(ActionEvent arg0) 
		{
			String bid=textField.getText();
			String query="select * from book where id=?";
		     try
		     {
		      Connection con=DBInfo.con;
		      PreparedStatement ps=con.prepareStatement(query);
		      ps.setString(1, bid);;
		      ResultSet res=ps.executeQuery();
		      res.next();
		      name=res.getString(2);
		      author=res.getString(3);
		      pub=res.getString(4);
		      cat=res.getString(5);
		      sub=res.getString(6);
		     
		      price=res.getString(7);
		     
		     
		      
		      
		      
		     }
		     catch(Exception e)
		     {
		    	 e.printStackTrace();
		     }
		     textField_1.setText(name);
		     //textField_2.setText(isbn);
		     textField_2.setText(price);
		     //textField_4.setText(qua);
		     comboBox.setSelectedItem(author);
		     comboBox_1.setSelectedItem(pub);
		     comboBox_2.setSelectedItem(cat);
		     comboBox_3.setSelectedItem(sub);
		}
		});
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			
				 int i=0;
					public void actionPerformed(ActionEvent arg0) {
						String id=textField.getText();
						String title=textField_1.getText();
						String price=textField_2.getText();
						//String price=textField_3.getText();
						//String quantity=textField_4.getText();
						String author=(String)comboBox.getSelectedItem();
						String publisher=(String)comboBox_1.getSelectedItem();
						String cat=(String)comboBox_2.getSelectedItem();
						String sub=(String)comboBox_3.getSelectedItem();
						
						String query="update book set name=?,author=?,publisher=?,subject=?,category=?,price=? where id=?";
					    try
					    {
					    PreparedStatement ps=DBInfo.con.prepareStatement(query);
					    ps.setString(1, title);
					    ps.setString(2, author);
					    ps.setString(3, publisher);
					    ps.setString(4, cat);
					    ps.setString(5, sub);
					    ps.setString(6, price);
					    //ps.setString(7, price);
					    //ps.setString(8, quantity);
					    ps.setString(7, id);
					    i=ps.executeUpdate();
					   // System.out.println(i);
					    }
					    catch(Exception e)
					    {
					    	e.printStackTrace();
					    }
					    if(i!=0)
						{
							JOptionPane.showMessageDialog(getParent(), "Updation done!!", "Success", JOptionPane.INFORMATION_MESSAGE);
						    reset();
						}
						else
						{
							JOptionPane.showMessageDialog(getParent(), "Updation failed!!", "Error", JOptionPane.ERROR_MESSAGE);
						}
					
					
					
					
					
			}
		});
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener()
		{


			 int i=0;
			public void actionPerformed(ActionEvent arg0)
			{
			String query="delete from book where id=?";
			String id=textField.getText();
			try
			{
			 PreparedStatement ps=DBInfo.con.prepareStatement(query);
			 ps.setString(1, id);
			 i=ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
				
			if(i!=0)
			{
				JOptionPane.showMessageDialog(getParent(), "Book Deleted!!", "Success", JOptionPane.INFORMATION_MESSAGE);
			    reset();
			}
			else
			{
				JOptionPane.showMessageDialog(getParent(), "Book not deleted!!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		
			
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(131)
									.addComponent(lblId))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(117)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblAuthor)
										.addComponent(lblName)
										.addComponent(lblPublisher, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblSubject, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblCategory, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblPrice, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
							.addGap(81)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAddnewbook, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField_1, Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(comboBox_1, Alignment.LEADING, 0, 86, Short.MAX_VALUE)
											.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(comboBox_2, Alignment.LEADING, 0, 86, Short.MAX_VALUE)
											.addComponent(comboBox_3, Alignment.LEADING, 0, 86, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(23)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(62)
							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpdate)
							.addGap(37)
							.addComponent(btnDelete)))
					.addContainerGap(180, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAddnewbook, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAuthor)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPublisher)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSubject)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategory)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrice)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnReset)
						.addComponent(btnUpdate)
						.addComponent(btnDelete))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

