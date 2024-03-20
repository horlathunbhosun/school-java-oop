package projectMoney;

import org.joda.money.Money;

public class ConsultantHours extends Saleable {
	
	//Attribute of the class
	private Money amountPerHr;
	private int hours;
	
	//Constructor
	 public ConsultantHours(Money amountPerHour, int hours) {
	        this.amountPerHr = amountPerHour;
	        this.hours = hours;
	 }
	 
	
	 
	 
	 //this is override the GetAmount in the Saleable class 
	 @Override
	 public Money getAmount() {
		 return amountPerHr.multipliedBy(hours);
	 }
	 
	

	@Override
	public String toString() {
		return "[amount=" + getAmount() + ", hours=" + hours + "]";
	}
	 
	 

}
