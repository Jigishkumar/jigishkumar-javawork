package Temp;

import java.util.Scanner;

//import java.lang.*;

public class Test {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);//accept the input
		System.out.println("Please enter your first name");
        String fName=scn.next();
        System.out.println("Please enter your last name");
        String lName=scn.next();
        System.out.println("Hello "+fName+" "+lName);

		
	}

}
