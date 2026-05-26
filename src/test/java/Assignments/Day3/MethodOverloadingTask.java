package Assignments.Day3;

public class MethodOverloadingTask {
	public void add(int a, int b) {
		System.out.println("Addition of 2 numbers are " +(a+b));
	}
	public void add(int a, int b,int c) {
		System.out.println("Addition of 3 numbers are " +(a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingTask m=new MethodOverloadingTask();
		m.add(10,20);
		m.add(20,20,20);
	}

}
