package constructor;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.name="Upasana";
		p1.age=32;
		p1.address="Bengaluru";
		p1.phone=12345;
		
		Person p2=new Person("Hilda",25,"USA",34567);
		Person p3=new Person("Kev",25,"UK",34567);
		Person p4=new Person("Arifi",25);
		p4.address="London";
		p4.phone=3456777;
		
		Trainee bob = new Trainee("Bob", "Software Development");
	    Trainee bill = new Trainee("Bill", "DevOps", true);
	}

}
