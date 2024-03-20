package projectMoney;

import java.time.LocalDate;

import org.joda.money.Money;


public class SalesNote extends Saleable implements Comparable<SalesNote> {
	
	private LocalDate date;
	
	// Declares a public constructor for the SalesNote class that takes three parameters
	public SalesNote(LocalDate date, String description, Money amount) {
		this.date = date;
		this.setDescription(description);
		this.setAmount(amount);
	}

	 // Indicates that this method overrides a method of the superclass
	@Override
	public String toString() {
		return "[date=" + date + ", description=" + this.getDescription() + ", amount=" + this.getAmount() + "]";
	}

	
	

	// Compares this SalesNote object with another SalesNote object based on their dates and amounts.
	@Override
	public int compareTo(SalesNote snObj) {
		int dateCompare = this.date.compareTo(snObj.date);
		if(dateCompare == 0) {
			return this.getAmount().compareTo(snObj.getAmount());
		}
		return dateCompare;
	}




	
	
	
	
	
}
