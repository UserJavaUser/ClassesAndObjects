package by.htp.customer.entity;

public class Customer {
	
	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private int creditCard;
	private int bankAccount;
	
	public Customer() {
		
	}
	
	public Customer(int id, String lastName, String firstName, String patronymic, int creditCard, int bankAccount) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public int getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	
	public int getBankAccount() {
		return bankAccount;
	}
	
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bankAccount;
		result = prime * result + creditCard;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (bankAccount != other.bankAccount)
			return false;
		if (creditCard != other.creditCard)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id " + id 
                + " " + lastName
                + " " + firstName
                + " " + patronymic
                + ", кредитная карта " + creditCard
                + ", банковский счет " + bankAccount + "]";
	}
	
}
