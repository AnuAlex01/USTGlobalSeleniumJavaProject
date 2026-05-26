package LabSession;

public class EmployeeDetails {
	//instance variable
	String employeeName;
		
	//static variable
	static String companyName="UST Global";
	
	public void displayEmployeeInfo(String name, int empId, double salary)
	{
		employeeName=name;
		String department="QA Automation";
		System.out.println("Employee Name is " + employeeName);
		System.out.println("Employee ID is " + empId);
		System.out.println("Salary is " + salary);
		System.out.println("Company Name is " + companyName);
		System.out.println("Department is " + department);
		
	}

	public static void main(String[] args) {
		EmployeeDetails e =new EmployeeDetails();
		e.displayEmployeeInfo("Anu", 101, 56789.98);

	}

}
