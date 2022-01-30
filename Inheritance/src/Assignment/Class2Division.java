package Assignment;

public class Class2Division extends Class1Add {
	public Class2Division()
	{
		super(10,30);
	}
public void display() {
	super.addNumber();
	if(sum%10==0) {
		
		System.out.println(sum+ ": Divisible by 10 ");
		
	}
	else {
		System.out.println("not divisible by 10");
	}
}
	public static void main(String[] args) {
		Class2Division obj=new Class2Division();
		obj.display();

	}

}
