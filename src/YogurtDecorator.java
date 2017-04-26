abstract class YogurtDecorator implements Yogurt {

	protected Yogurt tempYogurt;
	
	public YogurtDecorator(Yogurt yogurt){
		
		tempYogurt = yogurt;
		
	}
	
	public String getDescription(){
		
		return tempYogurt.getDescription();
		
	}
	
	public double getPrice(){
		
		return tempYogurt.getPrice();
		
	}
}
