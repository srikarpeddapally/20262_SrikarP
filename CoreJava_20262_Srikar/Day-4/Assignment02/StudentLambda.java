package Day04Assignments;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class StudentLambda {
	public List<Student>getStudentinSort(){
		List<Student> students = new StudentList().getStudent();
		Collections.sort(students,(s1,s2)->s2.getStdMarks().compareTo(s1.getStdMarks()));
		return students;
	}
	
	public static void main(String[] args) {
		StudentLambda s3 = new StudentLambda();
		System.out.println(new StudentLambda().getStudentinSort());
		
	}
}
