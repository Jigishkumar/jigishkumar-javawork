package PersonExample;

import java.util.ArrayList;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person("Jigish",35,"Customer Advisor");
//      System.out.println(prod1.toString());
		Person person2=new Person("Kev",38,"Manager");
//      System.out.println(prod2.toString());
		Person person3=new Person("Hasan",25,"Assistant Manager");;
//      System.out.println(prod3.toString());
		Person person4=new Person("Arifi",22,"Software Engineer");
//      System.out.println(prod4.toString());
      ArrayList<Person> list=new ArrayList<Person>();
      list.add(person1);
      list.add(person2);
      list.add(person3);
      list.add(person4);
      list.add(new Person("Hilda",29,"Managing Director"));
//      System.out.println(list);
      for (int i=0;i<list.size();i++)
      {
      	if(list.get(i) != null)
      	{
      		System.out.println(list.get(i));
      	}
      }
      Person p=new Person();
      p.getPerson(list);
	}



}


