package Assignments.Day1;

public class ReturnTypes {
	int getNumber() { 
		return 10;	
	}
	double getAmount() {
		return 99.50;
	}
	String getName() {
		return "Anu";
	}
	boolean isPassed() {
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypes obj=new ReturnTypes();
		System.out.println("Int Value : " + obj.getNumber());
		System.out.println("Double Value : " + obj.getAmount());
		System.out.println("String Value : " + obj.getName());
		System.out.println("Boolean Value : " + obj.isPassed());
	}

}
