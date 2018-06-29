package sm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.ComboBoxModel;
public class DBInfo 
{
	static Connection con;
	static Vector<String> header;
	static Vector outer;
	   static
	   {
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost/library1";
                con=DriverManager.getConnection(url, "root", "rat");	
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}}
		public static int insertvalue(String s1,String str)
		{  int i=0;
			 String query="insert into ? values(0,?)";
			  try
			 {
				   PreparedStatement ps=con.prepareStatement(query);
				   ps.setString(2,s1);
				   ps.setString(1,str.toUpperCase());
				 i=ps.executeUpdate();
				   
			 }
			 catch(Exception e)
			 {
				  e.printStackTrace();
			 }
			  return i;
		}
	   public static Vector <String> getAuthor()
	   {
		   Vector <String> v=new Vector<>();
		   String query="select name from author order by name";
		   try
		   {
			    PreparedStatement ps=con.prepareStatement(query);
			    ResultSet res=ps.executeQuery();
			    while(res.next())
			    {
			    	 v.add(res.getString(1));
			    	 
			    }
		   }
		   catch(Exception e)
		   {
			    e.printStackTrace();
		   }
		   return v;
	   }
	   public static Vector <String> getPublisher()
	   {
		   Vector <String> v=new Vector<>();
		   String query="select name from publisher order by name";
		   try
		   {
			    PreparedStatement ps=con.prepareStatement(query);
			    ResultSet res=ps.executeQuery();
			    while(res.next())
			    {
			    	 v.add(res.getString(1));
			    	 
			    }
		   }
		   catch(Exception e)
		   {
			    e.printStackTrace();
		   }
		   return v;
	   }
	   public static Vector <String> getSubject()
	   {
		   Vector <String> v=new Vector<>();
		   String query="select name from subject order by name";
		   try
		   {
			    PreparedStatement ps=con.prepareStatement(query);
			    ResultSet res=ps.executeQuery();
			    while(res.next())
			    {
			    	 v.add(res.getString(1));
			    	 
			    }
		   }
		   catch(Exception e)
		   {
			    e.printStackTrace();
		   }
		   return v;
	   }
	   public static Vector <String> getCategory()
	   {
		   Vector <String> v=new Vector<>();
		   String query="select name from category order by name";
		   try
		   {
			    PreparedStatement ps=con.prepareStatement(query);
			    ResultSet res=ps.executeQuery();
			    while(res.next())
			    {
			    	 v.add(res.getString(1));
			    	 
			    }
		   }
		   catch(Exception e)
		   {
			    e.printStackTrace();
		   }
		   return v;

}
	   
public static void getAllBooks()
{      header= new Vector<>();
       outer=new Vector<>();
       String query="select * from book";
       try
       {
    	    PreparedStatement ps=con.prepareStatement(query);
    	    ResultSet res=ps.executeQuery();
    	    ResultSetMetaData rsmd=res.getMetaData();
    	    int col=rsmd.getColumnCount();
    	    for(int i=1;i<=col;i++)
    	    {
    	    	String colName=rsmd.getColumnName(i);
    	    	header.add(colName);
    	    }
    	    
         while(res.next())
         {
        	 Vector<String>records=new Vector<>();
        	 for(int i=1;i<=col;i++)
        	 {
        		  String v=res.getString(i);
        		  records.add(v);
        	 }
        	 outer.add(records);
         }	 }
         catch(Exception e)
         {
          e.printStackTrace();
    	    
       }
}
public static void getvalues1(String value,String name)
{      header= new Vector<>();
       outer=new Vector<>();
       String query="select * from book where "+value+"=?";
       
       try
       {
    	    PreparedStatement ps=con.prepareStatement(query);
    	    
    	  //  ps.setString(1,value);
            ps.setString(1,name);
    	    ResultSet res=ps.executeQuery();
    	    ResultSetMetaData rsmd=res.getMetaData();
    	    int col=rsmd.getColumnCount();
    	    for(int i=1;i<=col;i++)
    	    {
    	    	String colName=rsmd.getColumnName(i);
    	    	header.add(colName);
    	    }
    	    
         while(res.next())
         {
        	 Vector<String>records=new Vector<>();
        	 for(int i=1;i<=col;i++)
        	 {
        		  String v=res.getString(i);
        		  records.add(v);
        	 }
        	 outer.add(records);
         }	 }
         catch(Exception e)
         {
          e.printStackTrace();
    	    
       }
}

}
       

