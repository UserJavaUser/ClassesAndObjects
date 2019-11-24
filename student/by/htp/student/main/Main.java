package by.htp.student.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.htp.student.entity.Group;
import by.htp.student.entity.Student;
import by.htp.student.logic.GroupLogic;
import by.htp.student.view.StudentView;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10. 
*/

public class Main {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("Ivanov", 'I', 'A', new int[] {3, 6, 9, 7, 6});
		Student st2 = new Student("Petrova", 'B', 'K', new int[] {6, 6, 7, 7, 6});
		Student st3 = new Student("Havrichenko", 'B', 'Н', new int[] {9, 9, 9, 9, 10});
		Student st4 = new Student("Kurochkin", 'G', 'A', new int[] {10, 10, 9, 10, 9});
		Student st5 = new Student("Ivanova", 'О', 'A', new int[] {8, 6, 9, 7, 6});
		Student st6 = new Student("Sidorova", 'А', 'A', new int[] {6, 6, 8, 7, 6});
		Student st7 = new Student("Artemov", 'Н', 'Н', new int[] {9, 9, 9, 9, 9});
		Student st8 = new Student("Galochkina", 'М', 'A', new int[] {5, 5, 6, 7, 6});
		Student st9 = new Student("Nikitina", 'А', 'Т', new int[] {10, 10, 9, 9, 9});
		Student st10 = new Student("Petrichenko", 'А', 'A', new int[] {6, 6, 8, 7, 6});
		
		Group group1 = new Group(1, new ArrayList<Student>(Arrays.asList(st1, st2)));
		Group group2 = new Group(2, new ArrayList<Student>(Arrays.asList(st3, st4)));
		Group group3 = new Group(3, new ArrayList<Student>(Arrays.asList(st5, st6, st7)));
		Group group4 = new Group(4, new ArrayList<Student>(Arrays.asList(st8, st9, st10)));
		
		GroupLogic groupLogic = new GroupLogic();
		List<Student> excellentStudents1 = groupLogic.takeExcellentStudents(group1);
		List<Student> excellentStudents2 = groupLogic.takeExcellentStudents(group2);
		List<Student> excellentStudents3 = groupLogic.takeExcellentStudents(group3);
		List<Student> excellentStudents4 = groupLogic.takeExcellentStudents(group4);
		
		StudentView stView = new StudentView();
		stView.printExcellentStudents(group1.getGroup(), excellentStudents1);
		stView.printExcellentStudents(group2.getGroup(), excellentStudents2);
		stView.printExcellentStudents(group3.getGroup(), excellentStudents3);
		stView.printExcellentStudents(group4.getGroup(), excellentStudents4);

	}
 
}
