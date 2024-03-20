package projectMoney;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;


public class SalesPerson {
	
	private String name;
	private BigDecimal provision;
	
	private ArrayList<SalesNote> salesNote;
	
	public SalesPerson() {
        this.salesNote = new ArrayList<>();
        
        //i make sure i initialize this.provision to BigDecimal One because 
        //it is going to be multiplied by the total provisions and if i set to 0 it would always give 0 that why i set it to 1;
        this.provision = BigDecimal.ONE;
	
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getProvision() {
		return provision;
	}
	public void setProvision(BigDecimal provision) {
		this.provision = provision;
	}
	public ArrayList<SalesNote> getSalesNote() {
		return salesNote;
	}
	public void setSalesNote(ArrayList<SalesNote> salesNote) {
		this.salesNote = salesNote;
	}
	
	public void add(SalesNote sn) 
	{
		salesNote.add(sn);
	}
	
	public void remove(SalesNote sn) {
		salesNote.remove(sn);
	}
	
	
	// Finds and returns the SalesNote object representing the best sale among all sales notes.
	public SalesNote bestSale() {
		SalesNote bestSale = salesNote.get(0); 
		for (SalesNote saleNote : salesNote) {
	        // Check if the current sale's amount is greater than the best sale's amount
			if (saleNote.getAmount().isGreaterThan(bestSale.getAmount())) {
				bestSale = saleNote; 
			}
		}
		return bestSale;
	}
	
	// Finds and returns the SalesNote object representing the poorest sale among all sales notes.
	public SalesNote poorestSale() {
	    SalesNote poorestSale = salesNote.get(0); 
	    for (SalesNote saleNote : salesNote) {
	        // Check if the current sale's amount is less than the poorest sale's amount
	        if (saleNote.getAmount().isLessThan(poorestSale.getAmount())) {
	            poorestSale = saleNote;
	        }
	    }
	    return poorestSale;
	}

	// Calculates and returns the total provision for sales with a given description.
	public BigDecimal totalProvision(String description) {
        BigDecimal totalProvision = BigDecimal.ZERO;
        for (SalesNote saleNoteObject : salesNote) {
            // Check if the description of the current sale matches the given description
        	if (saleNoteObject.getDescription().equals(description)) {
                // Add provision multiplied by the sale amount to the total provision
                totalProvision = totalProvision.add(provision.multiply(saleNoteObject.getAmount().getAmount()));
            }
        }
        return totalProvision;
    }
	
	   public void printSales() {
	        // Sort sales notes chronologically and by amount
	        Collections.sort(salesNote);
	        for (SalesNote saleNote : salesNote) {
	            System.out.println("Print Sales': " +saleNote);
	        }
	    }
	
	
	
	

}
