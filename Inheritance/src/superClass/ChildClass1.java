package superClass;

public class ChildClass1 extends SuperParent1{
	int number;
	public ChildClass1(int number) {
		
		super(888);
		this.number=number;
		
	}
	public void displayChild(int a) {
		
		super.number=a;
		super.displayParent();
		System.out.println("child class method: " +number);
	}
	
	

	public static void main(String[] args) {
		ChildClass1 obj=new ChildClass1(55);
		obj.displayChild(800);
		

	}

}
