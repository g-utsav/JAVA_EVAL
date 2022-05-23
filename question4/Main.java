package question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter(int) : ");
		int num = sc.nextInt();
		
		System.out.println("===========================================");
		for(int i=0; i<num; i++) {
			System.out.println("Enter the Roll Number : ");
			String roll = sc.next();
			
			sc.nextLine();
			System.out.println("Enter the Name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter the marks : ");
			int marks = sc.nextInt();
			System.out.println();
			Student student = new Student(roll, name, marks);
			
			System.out.println("Student Detail 0"+(i+1));
			System.out.println("Student Roll Number: "+ student.getRollNumber());
			System.out.println("Student Name: "+student.getStudentName());
			System.out.println("Student Mark: "+student.getMarks());
			System.out.println("===========================================");
		}
		
		sc.close();

	}

}
