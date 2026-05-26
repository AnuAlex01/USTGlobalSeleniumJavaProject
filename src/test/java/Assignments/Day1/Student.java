package Assignments.Day1;

public class Student {
	String name;
	int age;
	int rollNumber;
	
	void displayStudentDetails() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Roll Number : " + rollNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.name ="Anu";
		s.age=25;
		s.rollNumber=10;
		s.displayStudentDetails();
	}

}
