package MethodOverriding;

public class Child extends Parent {
	public void print(int num1,int num2)
	{
		int multiply;
		multiply=num1*num2;
		System.out.println("product of two numbers is :"+multiply);
		//super.print(300,200);
	}

	public static void main(String[] args) {
Child objChild=new Child();
objChild.print(10, 20);
Parent objParent=new Parent();
objParent.print(30, 20);
	}

}
