package Assignments.Day1;

public class SquareNumber {
		int findSquare(int number) {
			return number*number;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareNumber obj=new SquareNumber();
		int result=obj.findSquare(5);
		System.out.println("Square is " + result);
	}

}
