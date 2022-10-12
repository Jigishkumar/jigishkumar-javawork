package Method;

public class TestTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tele=new Television();
		tele.brand="Samsung";
		tele.price=1200;
		tele.screenSize=55;
		tele.turnOn();
		//Method one to get return values from a java method
		int x=tele.switchToAChannel();
		System.out.println(x);
		//Method two to get return values from a java method
		System.out.println(tele.switchToAChannel());
		
		double discount=tele.getDiscount();
		System.out.println(discount);
		
		double discountOnBF=tele.discountOnBlackFriday(10);
		System.out.println(discountOnBF);
		double discountAtTheEnd=tele.discountOnBlackFriday(50);
		System.out.println(discountAtTheEnd);
		double totalDiscount=tele.dicountWithCityBank(30, 25);
        System.out.println(totalDiscount);
		}

}
