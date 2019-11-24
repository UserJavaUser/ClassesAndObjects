package by.htp.customer.logic;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import by.htp.customer.entity.Customer;

public class CustomerLogic {

	public List<Customer> compareCustomers(List<Customer> customers) {
		for(int i = 0; i < customers.size(); i ++) {
			for (int j = i + 1; j < customers.size(); j++) { 
                if (customers.get(i).getLastName().compareTo(customers.get(j).getLastName())>0) 
                {
                	Collections.swap(customers, i, j);
                }
                if (customers.get(i).getLastName().compareTo(customers.get(j).getLastName())==0) 
                {
                	if (customers.get(i).getFirstName().compareTo(customers.get(j).getFirstName())>0) 
                     {
                     	Collections.swap(customers, i, j);
                     }
                }
            }
		}
		return customers;
	}
	
	public List<Customer> findByCard(List<Customer> customers2, int first, int second) {
		List<Customer> customersByCard = new ArrayList<Customer>();
		for(Customer customer : customers2) {
			if(customer.getCreditCard() >= first && customer.getCreditCard() <= second ) {
				customersByCard.add(customer);
			}
		}
		return customersByCard;
	}

	
}
