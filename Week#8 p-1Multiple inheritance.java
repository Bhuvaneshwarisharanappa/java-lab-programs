package week8;
interface allowance{
	final double dearnessAllow=0.45;
	final double houseRentAllow=0.30;
	final double cityAllow=400.00;
	void calculateGross();
}
class Employee{
	double basicSalary, grossSalary;
	String empName;
	long empNumber;
	Employee (String name, long no, double sal){
		empName=name;
		empNumber=no;
		basicSalary=sal;
	}
	void displayEmployeeDetails() {
		System.out.println("***********************************************************");
		System.out.println("Employee name is \t:\t"+empName);
		System.out.println("His emp no is \t: \t"+empNumber);
		System.out.println("His Basic Salary is \t:\t"+basicSalary);
		System.out.println("His Gross Salary is \t:\t"+grossSalary);
	}
}
class payRoll extends Employee implements allowance{
	payRoll(String name, long no, double sal){
		super(name,no,sal);
		calculateGross();
	}
	public void calculateGross() {
		grossSalary = basicSalary + (basicSalary*dearnessAllow)+(basicSalary*houseRentAllow)+(cityAllow);
	}
}
public class multiple_inheritence {
	public static void main(String args[]) {
		payRoll virat=new payRoll("Virat Sharma",128966,45678.0d);
		virat.displayEmployeeDetails();
		payRoll MSD = new payRoll("Mahendra Singh Dhoni",129966,25678.0d);
		MSD.displayEmployeeDetails();
	}
}
