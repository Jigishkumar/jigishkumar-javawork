package inheritance;

public  class Person {
	String name;
	int age;
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Person constructor");
	}
	public  void doSomething()//no body
	//normal/instance method with body
    {
        System.out.println("People do something to make their living");
    }
}
