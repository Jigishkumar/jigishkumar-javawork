package conditions;

import java.util.Scanner;

public class TestCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scn.next();
		System.out.println("Enter your city");
		String city=scn.next();//create
		
		if(city.equals("London"))
			System.out.println("Hello "+name+" you are  a British");
		else if(city.equals("NewYork"))
			System.out.println("Hello "+name+" you are a Newyorker");
			else
			System.out.println("I don't know");
		scn.close();
		
	}
}


