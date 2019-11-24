package by.htp.student.logic;

import java.util.ArrayList;
import java.util.List;
import by.htp.student.entity.*;

public class GroupLogic {
	
	private StudentLogic stLogic = new StudentLogic();
	
	public List<Student> takeExcellentStudents(Group group){
		List<Student> excellentStudents = new ArrayList<Student>();
		List<Student> students = group.getStudents();
		for(Student student : students) {
			if(stLogic.isExcellentStudent(student)) {
				excellentStudents.add(student);
			}
			else {
				return null;
			}
		}
		return excellentStudents;
	}
	
}
