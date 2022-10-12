
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare
		//Instantiate
		//Initialize
		
		String[] student;//Declare
		student=new String[5];
		student[0]="Hilda";
		student[1]="Hasan";
		student[2]="Kev";
		student[3]="Arifi";
		student[4]="Edith";
		
		String[] city=new String[3];
		city [0]="India";
		city [1]="UK";
		city [2]="Canada";
		
		String[] fruits= {"Banana", "Apple", "Grapes, Guava", "pineapple", "Avacado"};
			System.out.println("Students----");
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
			
		}
		System.out.println("Fruits----");
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		System.out.println("zipcode----");
		int[] zipcode= {2345,3456,6634,344,454,454,6,6};
		for(int i=0;i<zipcode.length;i++)
		{
			System.out.println(zipcode[i]);
		}
		
	}

}
