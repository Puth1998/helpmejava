package helpmejava;

public class Sales {
	public String customerNumber;
	public int sales;

	public Sales() {
	}
	
	public Sales(String nb, int sales) {
		this.customerNumber = nb;
		this.sales = sales;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
	
}
