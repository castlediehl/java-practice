
public class Invoice {
	
	private String number;
	private String description;
	int qty;
	double price;
	
	public Invoice() {
		number = new String("");
		description = new String("");
		qty = 0;
		price = 0;
	}
	
	public double getInvoiceAmount() {
		
		if(qty < 0) {
			qty = 0;
		}
		else if(price < 0) {
			price = 0.0;
		}
		double total = price * qty;
		System.out.println(total);
		return total;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
