package by.htp.test1.logic;

import by.htp.test1.entity.Test1;

public class Test1Logic {
	
	public int sumValues(Test1 t) {
		int sum = t.getValue1() + t.getValue2();
		return sum;
	}
	
	public int findMax(Test1 t) {
		int max = t.getValue1();
		if(t.getValue2() > t.getValue1()){
			max = t.getValue2();
		}
		return max;
	}

}
