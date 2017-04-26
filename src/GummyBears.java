
public class GummyBears extends YogurtDecorator {

	public GummyBears(Yogurt yogurt) {
		super(yogurt);
		
		System.out.println("Adding Gummy Bears");
		
	}

public String getDescription(){
		
		return tempYogurt.getDescription() + ", Gummy Bears";
		
	}
	
	public double getPrice(){
		
		System.out.println("Price of Gummy Bears: " + .50 );
		return tempYogurt.getPrice() + .50;
		
	}
}
