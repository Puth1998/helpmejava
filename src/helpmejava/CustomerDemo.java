package helpmejava;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		String number, name, number2;
		int s, sl;
		
		customers customer = new customers();
		Sales sale = new Sales();
		CalSalary sum = new CalSalary();
		Output print = new Output();
		
		System.out.print("Enter CustomerNumber, Name, Salary :");
		number = in.next();
		name = in.next();
		s = in.nextInt();
		customer = new customers(number,name,s);
		
		System.out.println();
		System.out.print("Enter CustomerNumber, Sale:");
		number2 = in.next();
		sl = in.nextInt();
		sale = new Sales(number2, sl);
		
		if ( customer.getCustomerNumber().equals(number2)) {
			customer.setSale(sale);
			sum = new CalSalary(s,sl);
		}
		
		print.print(sum.sumsalary());
	}

}
