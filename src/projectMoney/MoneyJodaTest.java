package projectMoney;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class MoneyJodaTest {

	public static void main(String[] args) {

		//Obtains an instance of Money from a double using a well-defined conversion
		//This allows you to create an instance with a specific currency and amount.
		//No rounding is performed on the amount, so it must have a scale compatible with the currency.

        Money money =  Money.of(CurrencyUnit.EUR, 300);

        //Print amount
        System.out.println("amount: "+ money.getAmount()); //output should be amount: 300
        
       //Print currency
        
        System.out.println("currency: " + money.getCurrencyUnit()); //output should be currency: EUR
        
        // Print the formatted string
        System.out.println("formatted: " + money.toString()); //output should be formatted: EUR 300
        
        
        
		
	}

}
