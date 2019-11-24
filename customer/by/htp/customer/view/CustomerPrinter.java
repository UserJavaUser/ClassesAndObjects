package by.htp.customer.view;

import java.util.List;

import by.htp.customer.entity.Customer;

public class CustomerPrinter {
	
	public void printCustomers(List<Customer> customersByOrder) {
		for(Customer customer : customersByOrder) {
	        System.out.println(customer);
	    }
	}
}
