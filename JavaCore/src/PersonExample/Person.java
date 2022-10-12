package PersonExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	String Name;
	int Age;
	String JobTitle;
	public void getPerson(ArrayList<Person> x)
    {
    
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter JobTitle");
        String jTitle=scn.next();
        for(int i=0;i<x.size();i++)
        {
            
            if(x.get(i).JobTitle.equals(jTitle))
            {
                System.out.println(x.get(i));
            }
        }
    }
	public Person(String Name, int Age, String JobTitle)
	{
		super();
		this.Name = Name;
		this.Age= Age;
		this.JobTitle= JobTitle;
	}
	public Person( ) {
		super();
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}
	public String JobTitle() {
		return JobTitle;
		
	}
	public void setJobTitle(String JobTitle)
	
	{
		this.JobTitle=JobTitle;
		
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Person \n [Name=" + Name + "\n Age=" + Age + "\n JobTitle=" + JobTitle +"]\n";
	}
}

