package Inheritance;

public class Child extends Parent {
	public void displayChild() {
		
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.displayChild();
		obj.displayParent();

	}

}
