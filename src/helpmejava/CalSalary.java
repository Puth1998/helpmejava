package helpmejava;

public class CalSalary {
	public String customerNumber;
	public int salary;
	public int sales;

	public CalSalary() {
		
	}
	
	public CalSalary(int s,int sl) {
		this.salary = s;
		this.sales = sl;
		
	}
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	public double sumsalary() {
		double sumsalary = 0;
		if( this.sales <= 50000){
			sumsalary = (int) (this.sales*0.05);
		}else {
			sumsalary = (int) (this.sales*0.10);
		}

		return sumsalary+this.salary;
	}
	

}
