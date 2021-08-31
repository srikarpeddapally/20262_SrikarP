<<<<<<< HEAD
package Day04Assignments;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UserClass {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setEmpName("Srikar");
		e1.setEmpSal(15000);
		Employee e2 = new Employee();
		e2.setEmpId(234);
		e2.setEmpName("mittu");
		e2.setEmpSal(8000);
		Employee e3 = new Employee();
		e3.setEmpId(345);
		e3.setEmpName("sri");
		e3.setEmpSal(9000);
		Employee e4 = new Employee();
		e4.setEmpId(789);
		e4.setEmpName("john");
		e4.setEmpSal(3000);
		Employee e5 = new Employee();
		e5.setEmpId(123);
		e5.setEmpName("cena");
		e5.setEmpSal(1000);
		Employee e6 = new Employee();
		e6.setEmpId(007);
		e6.setEmpName("rock");
		e6.setEmpSal(10000);
		
		EmployeeIntImplementation l1 = new EmployeeIntImplementation();
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		l1.addEmployee(e3);
		l1.addEmployee(e4);
		l1.addEmployee(e5);
		l1.addEmployee(e6);
		System.out.println(l1.getEmployee());
		System.out.println(l1.yearSalary(e6));
		System.out.println(l1.appSalary(e5));
		
//		duplicates using comparable
//		adding 5000 to empsal
//		not able to do it
		
		
	}
=======
package Day04Assignments;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UserClass {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setEmpName("Srikar");
		e1.setEmpSal(15000);
		Employee e2 = new Employee();
		e2.setEmpId(234);
		e2.setEmpName("mittu");
		e2.setEmpSal(8000);
		Employee e3 = new Employee();
		e3.setEmpId(345);
		e3.setEmpName("sri");
		e3.setEmpSal(9000);
		Employee e4 = new Employee();
		e4.setEmpId(789);
		e4.setEmpName("john");
		e4.setEmpSal(3000);
		Employee e5 = new Employee();
		e5.setEmpId(123);
		e5.setEmpName("cena");
		e5.setEmpSal(1000);
		Employee e6 = new Employee();
		e6.setEmpId(007);
		e6.setEmpName("rock");
		e6.setEmpSal(10000);
		
		EmployeeIntImplementation l1 = new EmployeeIntImplementation();
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		l1.addEmployee(e3);
		l1.addEmployee(e4);
		l1.addEmployee(e5);
		l1.addEmployee(e6);
		System.out.println(l1.getEmployee());
		System.out.println(l1.yearSalary(e6));
		System.out.println(l1.appSalary(e5));
		
//		duplicates using comparable
//		adding 5000 to empsal
//		not able to do it
		
		
	}
>>>>>>> 57dff35f3ddee6a7a1aeb77c2c2bf8c9dd082ec3
}