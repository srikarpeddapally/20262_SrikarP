package Day04Assignments;

import java.util.List;

public interface EmployeeInterface {
	
	public void addEmployee(Employee e);
	
	public void getEmployee(Employee e);
	
	public void deleteEmployee(Employee e);
	
	public double yearSalary(Employee e1);
	
	public double appSalary(Employee e1);

	List<Employee> getEmployee();

}
