<<<<<<< HEAD
package Day04Assignments;

import java.util.*;

public class EmployeeIntImplementation implements EmployeeInterface{
	
	List<Employee> l1 = new LinkedList<>();

	public EmployeeIntImplementation() {
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addEmployee(Employee e) {
		l1.add(e);
		
	}

	@Override
	public void deleteEmployee(Employee e) {
		l1.remove(e);
		
	}
	
	@Override
	public double yearSalary(Employee e1) {
		return (e1.getEmpSal()*12); 
	
	}

	@Override
	public double appSalary(Employee e1) {
	
		return 0;
	}

	@Override
	public void getEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return l1;
	}
	
	
	

}
=======
package Day04Assignments;

import java.util.*;

public class EmployeeIntImplementation implements EmployeeInterface{
	
	List<Employee> l1 = new LinkedList<>();

	public EmployeeIntImplementation() {
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addEmployee(Employee e) {
		l1.add(e);
		
	}

	@Override
	public void deleteEmployee(Employee e) {
		l1.remove(e);
		
	}
	
	@Override
	public double yearSalary(Employee e1) {
		return (e1.getEmpSal()*12); 
	
	}

	@Override
	public double appSalary(Employee e1) {
	
		return 0;
	}

	@Override
	public void getEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return l1;
	}
	
	
	

}
>>>>>>> 57dff35f3ddee6a7a1aeb77c2c2bf8c9dd082ec3
