import java.util.ArrayList;

public class ArrayListPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[5];
		ArrayList list=new ArrayList();
		list.add("Upasana");
		list.add(12.55);
		list.add(1234);
		list.add(true);
		list.add("Y");
		System.out.println(list);
		
		ArrayList<String> names=new ArrayList(4);
		//ArrayList<Strings> names=new Arraylist<Strings>
		names.add("Upasana");
		names.add("Hilda");
		names.add("Arifi");
		names.add("Hasan");
		names.add("Kev");
		names.add("Jigish");
		System.out.println(names);
		System.out.println(names.size());
		System.out.println((names.get(5)));
		
	}

}
