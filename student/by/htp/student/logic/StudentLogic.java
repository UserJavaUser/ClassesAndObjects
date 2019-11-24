package by.htp.student.logic;

import by.htp.student.entity.Student;

public class StudentLogic {
	
	public boolean isExcellentStudent(Student student) {
		int[] marks = student.getMarks();
		for(int mark : marks) {
			if(mark < 9) {
				return false;
			}
		}
		return true;
	}
}
