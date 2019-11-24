package by.htp.test1.view;

import java.util.Scanner;

import by.htp.test1.entity.Test1;

public class Test1Printer {
	
	String message = "Введите первую переменную";
	String message2 = "Введите вторую переменную";

	public Test1 enterTestFromConsole() {
		Test1 t = new Test1();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while(!sc.hasNext()) {
			sc.next();
			System.out.println(message);
		}
		t.setValue1(sc.nextInt());

		System.out.println(message2);
		while(!sc.hasNext()) {
			sc.next();
			System.out.println(message2);
		}
		t.setValue2(sc.nextInt());
		return t;
	}

	public Test1 changeTestFromConsole(Test1 t) {
		String message3 = "Измените переменные";
		System.out.println(message3);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while(!sc.hasNext()) {
			sc.next();
			System.out.println(message);
		}
		t.setValue1(sc.nextInt());
		
		System.out.println(message2);
		while(!sc.hasNext()) {
			sc.next();
			System.out.println(message2);
		}
		t.setValue2(sc.nextInt());
		return t;
	}
		
	public void printTest1(Test1 test1) {
		System.out.println(test1.toString());
	}
	
	public void printSum(int sum) {
		System.out.println("Cумма переменных test1 " + sum);
	}
	
	public void printMax(int max) {
		System.out.println("Наибольшее значение из переменных - это " + max);
	}
	
}
