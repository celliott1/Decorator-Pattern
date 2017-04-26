
public class Skittles extends YogurtDecorator {

	public Skittles(Yogurt yogurt) {
		super(yogurt);


		System.out.println("Adding Skittles");
	}
	
public String getDescription(){
		
		return tempYogurt.getDescription() + ", Skittles";
		
	}
	
	public double getPrice(){
		
		System.out.println("Price of Skittles: " + .75);
		return tempYogurt.getPrice() + .75;
		
	}

}
