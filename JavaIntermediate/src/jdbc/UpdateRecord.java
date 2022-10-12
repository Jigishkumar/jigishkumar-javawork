package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		
		try {
				String url="jdbc:mysql://localhost:3306/javadb";
				String userName="root";
				String password="1234";
				Connection con=DriverManager.getConnection(url, userName, password);
				System.out.println("Connected successfully");
				
				/*****new code*****/
				String query="update customer set phone=111111 where id+105;";  //query to be executed against DB"
				Statement stmt=con.createStatement();//to create SQL Statement	
				stmt.executeUpdate(query);
				System.out.println("One record updated successfully");
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("Something went wrong");
		
			}

		}

	}


