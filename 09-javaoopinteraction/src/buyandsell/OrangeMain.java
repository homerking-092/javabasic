package buyandsell;

public class OrangeMain {
	public static void main(String[] args) {
		OrangeSeller os1 = new OrangeSeller(10);
		os1.showOS();
		os1.sellOrange(2);
		os1.showOS();
		System.out.println("----------------");
		OrangeSeller os2 = new OrangeSeller(5);
		os2.showOS();
		os2.sellOrange(5);
		os2.showOS();
		os2.sellOrange(1);
		System.out.println("------------------");
		
		OrangeBuyer ob = new OrangeBuyer(10000);
		ob.showOBuyer();
		ob.buyOrange(os2, 4);
		
	}
}
