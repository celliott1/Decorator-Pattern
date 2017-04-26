
public class TestMain {

	public static void main(String[] args){
		 
		Yogurt order = new GummyBears(new Skittles(new Chocolate(new Strawberries(new Blueberries(new PlainYogurt())))));
		
		System.out.println();
		
		System.out.println("Order Description: " + order.getDescription() + "\n");
		
		System.out.println("Total Price: " + order.getPrice());
	}
}
