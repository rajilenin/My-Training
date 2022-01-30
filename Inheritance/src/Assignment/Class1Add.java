package Assignment;

public class Class1Add {
	int num1;
	int num2;
	int sum;
public Class1Add(int num1,int num2) 
{
	this.num1=num1;
	this.num2=num2;
	System.out.println("Two numbers are: " +num1+" "+num2);
	
}
public int addNumber() {
	
	sum=num1+num2;
	return sum;
	
}
}
