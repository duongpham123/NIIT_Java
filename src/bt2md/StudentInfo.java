package bt2md;

public class StudentInfo {
	private String studentId;
	private String studentName;
	private int studentAge;
	private double mark;
	
	public StudentInfo(String studentId, String studentName, int studentAge, double mark ) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.mark = mark;
	}
	public StudentInfo(double mark ) {
		this.mark = mark;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
}
