package by.htp.date.logic;

import by.htp.date.entity.Date;

public class DateLogic {

		public Date checkDate(Date date) {
			if(date.getHour() <= 0 || date.getHour() >= 24) {
				date.setHour(0);
			}
			if(date.getMinute() <= 0 || date.getMinute() >= 60) {
				date.setMinute(0);
			}
			if(date.getSecond() <= 0 || date.getSecond() >= 60) {
				date.setSecond(0);
			}
			return date;
		}

		public void changeDateHour(Date dateToChange, int value) {
			dateToChange.setHour(dateToChange.getHour() + value);
		}

		public void changeDateMinute(Date dateToChange, int value) {
			dateToChange.setMinute(dateToChange.getMinute() + value);
		}

		public void changeDateSecond(Date dateToChange, int value) {
			dateToChange.setSecond(dateToChange.getSecond() + value);
		}

}
