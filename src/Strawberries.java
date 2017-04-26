
public class Strawberries extends YogurtDecorator {

	public Strawberries(Yogurt yogurt) {
		super(yogurt);
		
		System.out.println("Adding Strawberries");
	}
	
public String getDescription(){
		
		return tempYogurt.getDescription() + ", Strawberries";
		
	}
	
	public double getPrice(){
		
		System.out.println("Price of Strawberries: " + .60);
		return tempYogurt.getPrice() + .60;
		
	}

}
