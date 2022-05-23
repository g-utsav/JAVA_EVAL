package question2;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	public Course(int courseId, String courseName, int courseFee) {
		this.courseId = courseId;
		this.courseFee = courseFee;
		this.courseName = courseName;
	}
	
	void displayCourseDetails() {
		System.out.println("Course Name : "+ courseName);
		System.out.println("Course ID : "+courseId);
		System.out.println("Course Fee : "+courseFee);
	}

	static void authenticate(String username, String password) {
		if(username == "Admin" && password == "1234") {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter course Name(String) : ");
			String courseName = sc.nextLine();
//			sc.nextLine();
			System.out.println("Enter Course Id(int) : ");
			int courseId = sc.nextInt();
			System.out.println("Enter Course Fees(int) : ");
			int courseFees = sc.nextInt();		
			
			Course cou = new Course(courseId, courseName, courseFees);
			cou.displayCourseDetails();
			
			sc.close();
		}else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		authenticate("Admin", "1234");//Valid Username and Password
		
		authenticate("admin", "0234");//Invalid Username and Password
	}
}
