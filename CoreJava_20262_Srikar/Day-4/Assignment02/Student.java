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
