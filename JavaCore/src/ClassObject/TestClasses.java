package ClassObject;

import java.util.Scanner;

public class TestClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Book book1=new Book();//create an object and allocate the memory
	//book1--->0000x
	book1.title="Tell me your dreams";
	book1.author="Sidney Sheldon";
	book1.price=15.50F;
	book1.publisher="XYZ publishing";
	System.out.println(book1.title);
	System.out.println(book1.author);
	System.out.println(book1.price);
	System.out.println(book1.publisher);
	
	book1.print();
	
	Book book2=new Book();
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter title");
	book2.title=scn.nextLine();
	System.out.println("Enter Author");
	book2.author=scn.nextLine();
	System.out.println("Enter Price");
	book2.price=scn.nextFloat();
	
	System.out.println(book2.title);
	System.out.println(book2.author);
	System.out.println(book2.price);
	System.out.println(book2.publisher);
	book2.print();
	scn.close();
	}

}
