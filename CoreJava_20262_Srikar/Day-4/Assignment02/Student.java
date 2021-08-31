<<<<<<< HEAD
package Day04Assignments;

public class Student {
	private int stdId;
	private String stdName;
	private Integer stdMarks; 
	
//	gave Integer because during compareTo it showed an error that it cant invoke compareTo for int
//	
	
	public Student(int stdid, String stdname, Integer stdmarks) {
		this.stdId=stdid;
		this.stdName=stdname;
		this.stdMarks=stdmarks;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Integer getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + stdMarks + "]";
	}

	
	
}
=======
package Day04Assignments;

public class Student {
	private int stdId;
	private String stdName;
	private Integer stdMarks; 
	
//	gave Integer because during compareTo it showed an error that it cant invoke compareTo for int
//	
	
	public Student(int stdid, String stdname, Integer stdmarks) {
		this.stdId=stdid;
		this.stdName=stdname;
		this.stdMarks=stdmarks;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Integer getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + stdMarks + "]";
	}

	
	
}
>>>>>>> 57dff35f3ddee6a7a1aeb77c2c2bf8c9dd082ec3
