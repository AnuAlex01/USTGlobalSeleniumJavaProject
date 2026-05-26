package Assignments.Day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		boolean isPrime=true;
		if (num<=1) {
			isPrime=false;
		}else {
			for(int i=2;i< num; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " is prime number");
		}else {
			System.out.println(num + " is not prime number");
		}
	}

}
