package Assignments.Day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int orginal= num;
		int reverse=0;
		while(num>0) {
			int digit=num%10;
			reverse=reverse *10 +digit;
			num=num/10;			
		}
		if(orginal ==reverse) {
			System.out.println(orginal + " is palindrome");
		}else {
			System.out.println(orginal + " is not palindrome");
		}
	}

}
