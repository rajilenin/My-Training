package Inheritance;

public class ClassTwo extends ClassOne {
public void child() {
	
	System.out.println("Am your Child");
}
	public static void main(String[] args) {
		ClassTwo obj=new ClassTwo();
		obj.parent();
		obj.child();

	}

}
