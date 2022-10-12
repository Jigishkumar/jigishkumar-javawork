package inheritance;

public class Manager extends Employee {
	String dept;
	public Manager(String name,int age,int empId, String dept)
	{
		//super()// calls the constructor of super class
		super(name,age,empId);
		this.dept=dept;
		System.out.println("Manager constructor");
	}

	public void doSomething()
    {
        System.out.println("Manager Manages their respective dept");
    }
}
