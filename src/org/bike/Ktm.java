package org.bike;

public class Ktm implements Bike {
	
	@Override
	public void cost() {
		System.out.println("The cost is 50000");
		
	}

	@Override
	public void speed() {
		System.out.println("The speed is 100km/perhour");
		
	}
	
	public static void main(String[] args) {
		
		Ktm bk = new Ktm();
		bk.cost();
		bk.speed();
		
		
		
		
	}
	
	
	
	
}
