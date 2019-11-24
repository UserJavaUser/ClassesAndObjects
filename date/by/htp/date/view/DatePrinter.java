package by.htp.date.view;

import java.util.Scanner;

import by.htp.date.entity.Date;

public class DatePrinter {
	
	public int enterHourFromConsole() {
		String message = "Введите часы";
		int hour = enterValue(message);
		return hour;
	}
	
	public int enterMinuteFromConsole() {
		String message = "Введите минуты";
		int hour = enterValue(message);
		return hour;
	}
	
	public int enterSecondFromConsole() {
		String message = "Введите секунды";
		int hour = enterValue(message);
		return hour;
	}
	
	public int enterValue(String string) {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(string);
		while(!sc.hasNext()) {
			sc.next();
			System.out.println(string);
		}
		value = sc.nextInt();
		return value;
	}

	public void printDate(Date date) {
		System.out.println(date.toString());
	}

	
}
