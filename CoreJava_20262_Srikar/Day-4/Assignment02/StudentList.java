package Day04Assignments;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	
	public List<Student>getStudent(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"srikar",60));
		students.add(new Student(2,"psunny",70));
		students.add(new Student(3,"mittu",80));
		students.add(new Student(4,"ksri",90));
		
		return students;
	}
}
