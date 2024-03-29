package by.htp.test1.entity;

public class Test1 {
	
	private int value1;
	private int value2;
	
	public Test1() {
		
	}
	
	public Test1(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value1;
		result = prime * result + value2;
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
		Test1 other = (Test1) obj;
		if (value1 != other.value1)
			return false;
		if (value2 != other.value2)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test1 [value1 = " + value1 + ", value2 = " + value2 + "]";
	}

	
}
