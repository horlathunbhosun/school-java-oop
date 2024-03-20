package projectMoney;

import org.joda.money.Money;

public abstract class Saleable implements Taxable {
	
	private String description;
	
	private Money amount;

	public String getDescription() {
		return description;
	}

	public Money getAmount() {
		return amount;
	}
	
	
	
	
	public void setDescription(String description) {
		this.description = description;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	@Override
	public Money tax() {
		
        Money taxAmount = amount.multipliedBy(0.20, null); // 20% tax rate
		return taxAmount;
	}
	
		
}
