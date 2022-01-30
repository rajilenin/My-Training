package superClass;

public class ChildClass extends SuperParent {

	public ChildClass(int a) 
	{
		super(77);
		System.out.println("Child class Constructor"+a);
		
		
	}
	public void displayChild() {
	
	}
	

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass(99);
	
	}

}
