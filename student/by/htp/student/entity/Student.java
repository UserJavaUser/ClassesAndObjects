package by.htp.student.entity;

import java.util.Arrays;

public class Student {
	
	private String lastName;
	private char firstNameInitial;
	private char patronymicInitial;
	private int[] marks = new int[MARK_COUNT];
	private static final int MARK_COUNT = 5;
	
	public Student() {
		
	}

	public Student(String lastName, char firstNameInitial, char patronymicInitial, int[] marks) {
		this.lastName = lastName;
		this.firstNameInitial = firstNameInitial;
		this.patronymicInitial = patronymicInitial;
		this.marks = marks;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getFirstNameInitial() {
		return firstNameInitial;
	}

	public void setFirstNameInitial(char firstNameInitial) {
		this.firstNameInitial = firstNameInitial;
	}

	public char getPatronymicInitial() {
		return patronymicInitial;
	}

	public void setPatronymicInitial(char patronymicInitial) {
		this.patronymicInitial = patronymicInitial;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student: " + lastName ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstNameInitial;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + patronymicInitial;
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
		Student other = (Student) obj;
		if (firstNameInitial != other.firstNameInitial)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (patronymicInitial != other.patronymicInitial)
			return false;
		return true;
	}
	
}
