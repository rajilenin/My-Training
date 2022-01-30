package Encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		
		ClassStudent obj1=new ClassStudent();
		obj1.setName("Raj");
		obj1.setRollNumber(100);
		ClassAddress obj2=new ClassAddress();
		obj2.setHouseName("Ashokam");
		obj2.setPlace("Trivandrum");
		obj2.setState("Kerala");
		obj2.setPinCode(695573);
		obj2.setStnd(obj1);
		obj2.display();
	}

}
