package Oops;



public class Car {
	
	Car(){
		System.out.println("Creating Constructor of Car Class");
	}
	
	public final void setWheels() {
		System.out.println("Only 4 wheels are allowed");
	}
	

	String name= "Car Segment";
	public void run() {
		System.out.println("Cas is running");
	}
}
