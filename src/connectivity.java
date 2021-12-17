import java.sql.*;

import java.util.*;



public class connectivity {

	public static void main(String[] args) {
		
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/class","root","root");  
			
			
			Statement stmt= con.createStatement();  

			Scanner s=new Scanner(System.in);
			System.out.println("enter he choice:-\n 1 insert\n 2 delete\n 3 update\n 4 read \n 5 get by id");
			  int choice=s.nextInt();
			  
			  switch(choice) {
			  
			  case 1: System.out.println("Inserting records into the table...");          
		         String sql = "INSERT INTO STUDENT VALUES (100, 'mangesh', '1996-05-12', '2025-09-20',6)";
		         stmt.executeUpdate(sql);
		         System.out.println("Inserting records ...");  
		         break;
		         
		         
			  case 2: String sql1 = "DELETE FROM STUDENT " +
			            "WHERE STUDENT_NO = 100";
		         stmt.executeUpdate(sql1);
		         System.out.println("Deleting records ..."); 
		         break;
		         
			  case 3: String sql2 = "UPDATE STUDENT SET  STUDENT_NAME='sumeet', STUDENT_DOB='1994-04-19',STUDENT_DOJ='2026-08-30' WHERE STUDENT_NO=101 ";
		         stmt.executeUpdate(sql2);
		         System.out.println("Updating records ..."); 
		         break;
		         
			  case 4: ;String sql3="SELECT * FROM STUDENT";
			          stmt.executeQuery(sql3);
	                  ResultSet rs = stmt.executeQuery(sql3);
	                  System.out.println("Reading records ..."); 
			  while(rs.next()){
		            //Display values
		            System.out.print("STUDENT_NO: " + rs.getInt("STUDENT_NO"));
		            System.out.print(" ");
		            System.out.print("STUDENT_NAME: " + rs.getString("STUDENT_NAME"));
		            System.out.print(" ");
		            System.out.print(" STUDENT_DOB: " + rs.getString("STUDENT_DOB"));
		            System.out.print(" ");
		            System.out.println(" STUDENT_DOJ: " + rs.getString("STUDENT_DOJ"));
		         }
			    break;
			  case 5:
				 
				  String sql4="SELECT * FROM STUDENT where STUDENT_ID = 3"; 
				  stmt.executeQuery(sql4);
			      ResultSet rs1 = stmt.executeQuery(sql4);
			       while(rs1.next())
			       {
		          
			    	System.out.print("you have succesfully get the info by ID := " + rs1.getInt("STUDENT_ID"));
			    	System.out.print(" ");
		            System.out.print("STUDENT_NO: " + rs1.getInt("STUDENT_NO"));
		            System.out.print(" ");
		            System.out.print("STUDENT_NAME: " + rs1.getString("STUDENT_NAME"));
		            System.out.print(" ");
		            System.out.print(" STUDENT_DOB: " + rs1.getString("STUDENT_DOB"));
		            System.out.print(" ");
		            System.out.println(" STUDENT_DOJ: " + rs1.getString("STUDENT_DOJ"));
			       }}}
			  
			  
			   catch(Exception e)
              {
				System.out.println(e);
			  }  
			 
			
			  }
}		  
	

