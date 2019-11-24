package by.htp.customer.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.customer.entity.Customer;
import by.htp.customer.logic.CustomerLogic;
import by.htp.customer.view.CustomerPrinter;

public class Main {
	public static void main(String[] args) {
		
		CustomerLogic cl = new CustomerLogic();
		CustomerPrinter cp = new CustomerPrinter();
		
		Customer customer1 = new Customer(1, "Ivanov", "Ivan", "Ivanovich", 345678, 789);
		Customer customer2 = new Customer(2, "Petrov", "Sergey", "Petrovich", 345617, 783);
		Customer customer3 = new Customer(3, "Ivanov", "Alexey", "Petrovich", 345677, 712);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);

		List<Customer> customersByOrder = cl.compareCustomers(customers);
		cp.printCustomers(customersByOrder);
		
		int first = 345617;
		int second = 345645;
		List<Customer> customersByCard = cl.findByCard(customers, first, second);
		cp.printCustomers(customersByCard);

	}
}
