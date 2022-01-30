package superClass;

public class SuperParent1 {

	protected int number;
	public SuperParent1(int a) {
		number=a;
		
		System.out.println("parent class constructor :" +number);
	}
	public void displayParent() {
	System.out.println("parent class method: "+number);
	}
}
