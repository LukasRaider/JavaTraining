package Oops;

public class Triangle extends Shape{

	
	public void display() {
		System.out.println("From Shape Class");
		
	}

	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s1 = new Circle();
		
		s.display();
		s1.display();
	}
}
