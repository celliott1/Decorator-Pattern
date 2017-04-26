
public class PlainYogurt implements Yogurt {

	@Override
	public String getDescription() {
		
		return "Vanilla Yogurt";
	}

	@Override
	public double getPrice() {
		
		System.out.println("Price of Vanilla Yogurt: " + 3.00);
		
		return 3.00;
	}
	
}
