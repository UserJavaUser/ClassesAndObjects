package by.htp.test1.main;

import by.htp.test1.entity.Test1;
import by.htp.test1.logic.Test1Logic;
import by.htp.test1.view.Test1Printer;

public class Test1Creator {
	public static void main(String[] args) {
		
		Test1Logic tl = new Test1Logic();
		Test1Printer printer = new Test1Printer();
		
		Test1 t = printer.enterTestFromConsole();
		t = printer.changeTestFromConsole(t);
		
		int sum = tl.sumValues(t);
		int max = tl.findMax(t);
		
		printer.printTest1(t);
		printer.printSum(sum);
		printer.printMax(max);
	}
}
