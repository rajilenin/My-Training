package Employee;

public class Class2 extends Class1{
	
float hra;
float pf;
public void displayClass2() 
{
	hra=(basicPay*5)/100;
	pf=(basicPay*20)/100;
	
} 
	public static void main(String[] args) {
		Class2 obj2=new Class2();
		obj2.displayClass1();

	}

}
