package switchexample;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String card = "Upasana";
	        switch (card) {
	        case "club":
	            System.out.println("you got a club");
	            break;
	        case "diamond":
	            System.out.println("you got a diamond");
	            break;
	        case "spade":
	            System.out.println("you got a spade");
	            break;
	        case "heart":
	            System.out.println("you got a heart");
	            break;
	        default :
	            System.out.println("Not a valid card");
	        }
	    

	}

}
