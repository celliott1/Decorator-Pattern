
public class Blueberries extends YogurtDecorator {

	public Blueberries(Yogurt yogurt) {
		super(yogurt);


		System.out.println("Adding Blueberries");
	}

public String getDescription(){
		
		return tempYogurt.getDescription() + ", Blueberries";
		
	}
	
	public double getPrice(){
		
		System.out.println("Price of Blueberries: " + .45);
		return tempYogurt.getPrice() + .45;
		
	}
}
