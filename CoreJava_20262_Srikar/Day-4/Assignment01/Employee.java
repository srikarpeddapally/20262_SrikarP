<<<<<<< HEAD
package Day04Assignments;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	public void compare(Employee e1, Employee e2) {
		try {
			if(e1.empId==e2.empId) {
				throw new Exception("duplicate id found");
			}
		}catch(Exception e) {System.out.println(e);}
	
		}
	
	}

	
	
	
	
	

=======
package Day04Assignments;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	public void compare(Employee e1, Employee e2) {
		try {
			if(e1.empId==e2.empId) {
				throw new Exception("duplicate id found");
			}
		}catch(Exception e) {System.out.println(e);}
	
		}
	
	}

	
	
	
	
	

>>>>>>> 57dff35f3ddee6a7a1aeb77c2c2bf8c9dd082ec3
