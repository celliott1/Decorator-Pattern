
public class Chocolate extends YogurtDecorator {

	public Chocolate(Yogurt yogurt) {
		super(yogurt);
		
		System.out.println("Adding Chocolate");
	}

public String getDescription(){
		
		return tempYogurt.getDescription() + ", Chocolate";
		
	}
	
	public double getPrice(){
		
		System.out.println("Price of Chocolate: " + .25);
		return tempYogurt.getPrice() + .25;
		
	}
}
