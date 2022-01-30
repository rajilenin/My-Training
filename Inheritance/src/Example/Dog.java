package Example;

public class Dog extends Animal {
	public void dogSound()
	{
		super.animalSound();
		System.out.println("The dog barks bow bow");
	}

	public static void main(String[] args) {
	Dog obj1=new Dog();
	obj1.dogSound();

	}

}
