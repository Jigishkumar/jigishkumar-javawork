package exception;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Sample {
	public static void main(String[] args) {
		try{
			int x=10;
		
		int y=0;
		int z=x/y;// logical issue
		int [] nums = new int[5];
		nums[4]=200;
		Connection con=DirverManager.getConnection("", "", "");
	}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("We can not div a num by zero");
	}finally {
		System.out.println("I will get executed always");
	}
	}
}

