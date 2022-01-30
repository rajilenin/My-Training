package Encapsulation;

public class Customer {
	

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setName("Raji");
		obj.setMoney(1000);
		obj.calc();
		System.out.println("Name is : " +obj.getName());
		System.out.println("Money  : " +obj.getMoney());

	}

}
