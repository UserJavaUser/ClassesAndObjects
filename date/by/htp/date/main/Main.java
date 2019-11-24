package by.htp.date.main;

import by.htp.date.entity.Date;
import by.htp.date.logic.DateLogic;
import by.htp.date.view.DatePrinter;

public class Main {
	
	public static void main(String[] args) {

		DatePrinter printer = new DatePrinter();
		DateLogic logic = new DateLogic();
		
		int hour = printer.enterHourFromConsole();
		int minute = printer.enterMinuteFromConsole();
		int second = printer.enterSecondFromConsole();

		Date date = new Date(hour, minute, second);
		logic.checkDate(date);
		printer.printDate(date);
		
		int changeHour = printer.enterHourFromConsole();
		logic.changeDateHour(date, changeHour);
		logic.checkDate(date);
		printer.printDate(date);
		
		int changeMinute = printer.enterMinuteFromConsole();
		logic.changeDateMinute(date, changeMinute);
		logic.checkDate(date);
		printer.printDate(date);
		
		int changeSecond = printer.enterSecondFromConsole();
		logic.changeDateSecond(date, changeSecond);
		logic.checkDate(date);
		printer.printDate(date);
	}
}
