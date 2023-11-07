package Oops;

public class BMW extends Car{
	
	String name = "BMW";
	BMW(){
		//super();
		System.out.println("Calling BMW Constructor");
	}
	 
	
	 
	 public void GetName() {
		 System.out.println(name);
		 System.out.println(super.name);
	 }
	 
	 public void run()
	 {
		 System.out.println("BMW is runing");
		 super.run();
	 }

	public static void main(String[] args) {
		
		/*Car car = new Car();
		System.out.println(name);
		car.run();
	*/
		
		BMW bmw= new BMW();
		bmw.GetName();
		bmw.run();
	}
	
		
}	
