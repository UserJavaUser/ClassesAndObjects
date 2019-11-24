package by.htp.student.view;

import java.util.List;

import by.htp.student.entity.Student;

public class StudentView {

	public void printExcellentStudents(int groupNumber, List<Student> students) {
		if(students != null) {
			System.out.println("Group number " + groupNumber);
			for(Student student : students) {
				System.out.println(student.toString());
			}
		}
	}

}
