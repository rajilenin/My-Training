package Employee;

public class Class3 extends Class2 {
	float totalSalary;
	public void displayClass3() {
		totalSalary=basicPay+hra-pf-deduction+bonus;
		System.out.println("Basic Pay :" +basicPay);
		System.out.println("Deduction from Salary :" +deduction);
		System.out.println("Bonus Allowed :" +bonus);
		System.out.println("HRA :" +hra);
		System.out.println("Provident Fund :" +pf);
		System.out.println("Total Salary :" +totalSalary);
	}
	

	public static void main(String[] args) {
		Class3 obj3=new Class3();
		obj3.displayClass1();
		obj3.displayClass2();
		obj3.displayClass3();	

	}

}
