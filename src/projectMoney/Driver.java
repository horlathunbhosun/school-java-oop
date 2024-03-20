package projectMoney;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.joda.money.Money;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create money object instances for the two SalesNotes
		Money money1 = Money.parse("EUR 202.2");
		Money money2 = Money.parse("EUR 200.2");

		//creating the objects of sales 
		SalesNote salesNote1 = new SalesNote(LocalDate.of(2024, 1, 15), "Testing my code", money1);
		SalesNote salesNote2 = new SalesNote(LocalDate.of(2024, 2, 22), "My money is plenty", money2);
		

		//associate the saleNote to salesPerson
		SalesPerson salesPerson = new SalesPerson();
		salesPerson.add(salesNote1);
		salesPerson.add(salesNote2);
		
		
		SalesNote poorestSale = salesPerson.poorestSale();
		
		

		//this is supposed to be totalSales  according to the  template of the answer but in the question it was totalProvision
		BigDecimal totalProvision = salesPerson.totalProvision("Testing my code"); 
		
		//create instances of consultantHours
		Money amountPerHr = Money.parse("EUR 100");
		ConsultantHours consultantHours = new ConsultantHours(amountPerHr, 10);
		
	
	
		//Print the value of sales both 1 and 2
		System.out.println("Value of sales 1:  "+ salesNote1.toString());
		System.out.println("Value of sales 2:  "+ salesNote2.toString());
		
		//print out Best sales in the console
		System.out.println("Best sales:"+salesPerson.bestSale());
			
		//print out poor sales in the console
		System.out.println("Sales note for poorest: "+ poorestSale.toString());
				
		//print total provision in the console
		System.out.println("Total provision for sales with description 'Testing my code': " + totalProvision);
	
		
		//printSales 
		salesPerson.printSales();
		
		//Consultant Hours
        System.out.println("Consultant Hours: " + consultantHours.toString());




				
	}

}
