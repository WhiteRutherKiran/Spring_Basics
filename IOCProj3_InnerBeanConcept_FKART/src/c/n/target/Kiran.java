package c.n.target;

import java.util.Random;

import c.n.beans.Courier;

public class Kiran {
//always code to interface 
	private Courier courier;
	
	public Kiran() {
		System.out.println("From Kiran");
	}
	//use setter injection here 
//	public void setCourier(Courier courier) {
//		this.courier=courier;
//	}
//	public Courier getCourier() {
//		return courier;
//	}
	//use constructor injection here 
	
	  public Kiran(Courier courier) { 
		  this.courier=courier; }
	 
	//b. method
	public String purchase(String items[]) {
		Random random = new Random();
		int OrderId = random.nextInt();
		String status = courier.deliver(OrderId);
		return status +" Bill amount for oreder id :: "+OrderId+" is 5000";
	}
}
