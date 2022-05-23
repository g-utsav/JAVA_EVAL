package question4;

public class Student {
	
	private String rollNumber;
	private String studentName;
	private int marks;
	
	public void setRollNumber(String val) {
		this.rollNumber = val;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setMarks(int val) {
		this.marks = val;
	}
	public int getMarks() {
		return marks;
	}
	
	Student(){
		
	}
	
	Student(String rollNumber, String studentName, int marks){
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
}
