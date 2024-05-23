package bt2md;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		StudentManagement studentmanagement = new StudentManagement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! Choose:");
		while(true) {
			System.out.println("0. List student");
			System.out.println("1. Check studentinfo");
			System.out.println("2. Check the highest student's gpa information");
			System.out.println("3. Check the lowest student's gpa information");
			System.out.println("4. Check the youngest student information");
			System.out.println("5. Check the oldest student information");	
			System.out.println("6. Exit");	
			
			sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 0:
				System.out.println("Student: " + "ID" + " " + "Name" + " " + "Age" +" " + " GPA");
				System.out.println("-----------------------------");
				for(StudentInfo students : studentmanagement.info) {
					System.out.println("Student:" +" "+ students.getStudentId() +" "+ students.getStudentName()+" "+ students.getStudentAge() +" "+ students.getMark());
					System.out.println("-----------------------------");
				}break;
			
			case 1:
			    System.out.println("Please enter your ID: ");
			    sc.nextLine();
			    String studentId = sc.nextLine();
			    if(studentmanagement.check(studentId) != null) {
			    	System.out.println("-----------------------------");
			        System.out.println("Student ID: " + studentmanagement.getStudentinfo().getStudentId());
			        System.out.println("Student Name: " + studentmanagement.getStudentinfo().getStudentName());
			        System.out.println("Student Age: " + studentmanagement.getStudentinfo().getStudentAge());
			        System.out.println("Student Mark: " + studentmanagement.getStudentinfo().getMark());
			        System.out.println("-----------------------------");
			    }
			    else {
			        System.out.println("ID is invalid");
			    }
			    break;

			
			case 2:
				ArrayList<Object> maxMarkInfo = StudentManagement.getMaxMark(studentmanagement.info);
				System.out.println("-----------------------------");
				System.out.println("Student with Min Mark:");
		        System.out.println("ID: " + maxMarkInfo.get(0));
		        System.out.println("Name: " + maxMarkInfo.get(1));
		        System.out.println("Age: " + maxMarkInfo.get(2));
		        System.out.println("GPA: " + maxMarkInfo.get(3));
		        System.out.println("-----------------------------");
				break;
				
			case 3 :
				ArrayList<Object> minMarkInfo = StudentManagement.getMinMark(studentmanagement.info);
				System.out.println("-----------------------------");
				System.out.println("Student with Min Mark:");
		        System.out.println("ID: " + minMarkInfo.get(0));
		        System.out.println("Name: " + minMarkInfo.get(1));
		        System.out.println("Age: " + minMarkInfo.get(2));
		        System.out.println("GPA: " + minMarkInfo.get(3));
		        System.out.println("-----------------------------");
				break;
				
			case 4:
				ArrayList<Object> youngestStuInfo = StudentManagement.getYoungest(studentmanagement.info);
				System.out.println("-----------------------------");
				System.out.println("Youngest student is :");
				System.out.println("ID: " + youngestStuInfo.get(0));
				System.out.println("Name: " + youngestStuInfo.get(1));
				System.out.println("Age: " + youngestStuInfo.get(2));
				System.out.println("GPA: " + youngestStuInfo.get(3));
				System.out.println("-----------------------------");
				break;
			
			case 5:
				ArrayList<Object> oldestStuInfo = StudentManagement.getOldest(studentmanagement.info);
				System.out.println("-----------------------------");
				System.out.println("Oldest student is :");
				System.out.println("ID: " + oldestStuInfo.get(0));
				System.out.println("Name: " + oldestStuInfo.get(1));
				System.out.println("Age: " + oldestStuInfo.get(2));
				System.out.println("GPA: " + oldestStuInfo.get(3));
				System.out.println("-----------------------------");
				break;
			
			case 6:
				System.out.println("Goodbye, see yah later !");
				sc.close();
				return;
			}
		}
		
	}
}
