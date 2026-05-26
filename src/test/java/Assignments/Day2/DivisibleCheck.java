package Assignments.Day2;

public class DivisibleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=55;
		if(num % 5 == 0 && num % 11 == 0)
		{
			System.out.println(num + " is divisible by 5 and 11");
		} else {
			System.out.println(num + " is not divisible by 5 and 11");
		}
	}

}
