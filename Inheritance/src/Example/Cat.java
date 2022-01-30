package Example;

public class Cat extends Pet {
	public void catColor() {
		
		super.petColor();
		System.out.println("my Cat is white in color");
		
	}

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.catColor();

	}

}
