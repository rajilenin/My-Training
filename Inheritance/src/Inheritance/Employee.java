
package Inheritance;
import java.util.Scanner;

public class Employee 
{
	int empId;
	String empName;
	int basicSalary,pf,hra,bonus,deduction,totalSalary;
	
	public void read() 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the employee Id");
		empId=obj.nextInt();
		System.out.println("Enter employee Name");
		empName=obj.nextLine();
		System.out.println("Enter basic salary of an employee");
		basicSalary=obj.nextInt();
	
	}
	public class Calculate{
		hra=(5/100)*basicSalary;
		pf=(20/100)*basicSalary;
		totalSalary=(basicSalary+hra–pf–deduction+bonus);
	}
	public void display() {
		System.out.println("Employee Details :" +empName);
		System.out.println("Employee Details :" +basicSalary);
		System.out.println("Employee Details :" +hra);
		System.out.println("Employee Details :" +pf);
		
		System.out.println("Employee Details :" +totalSalary);
	}

	public static void main(String[] args) {
		
		Employee obj1=new Employee();
		obj1.read();
		obj1.display();
	}

}
