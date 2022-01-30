package MethodOverriding;

public class Child1 extends Parent1 {
	public void print(int num1,int num2)
	{
		int multiply;
		multiply=num1*num2;
		System.out.println("product of two numbers is :"+multiply);
		//super.print(300,200);
	}

	public static void main(String[] args) {

Parent1 obj=new Child1();
obj.display();
obj.print(300,500);
	}

}
