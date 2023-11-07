package Program;

public class Dog {

	String nameString = "Jacky";
	String brredString = "Buldog";
	int height = 4;
	
	public void barking() {
		System.out.println(nameString + " is barking");
	}
	public void eating() {
		System.out.println(nameString + " is eating");
	}
	
	public static void main(String[]args)
	{
		Dog dogclass = new Dog();
		Dog obj2 = new Dog();
		
		System.out.println(dogclass.height);
		dogclass.barking();
		
		obj2.barking();
		dogclass.eating();
	}
}
