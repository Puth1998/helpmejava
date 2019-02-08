package helpmejava;

public class customers {
	private Sales sale;
	public String customerNumber;
	public String customerName;
	public int salary;

	
	public customers() {
		
	}
	
	public customers(String nb, String n, int s) {
		this.customerNumber = nb;
		this.customerName = n;
		this.salary = s;
	}



	public String getCustomerNumber() {
		return customerNumber;
	}



	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Sales getSale() {
		return sale;
	}

	public void setSale(Sales sale) {
		this.sale = sale;
	}
	
	
	






}
