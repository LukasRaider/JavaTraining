package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String text= "Anashul";
		System.out.println(text);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Hi I am inside finally block");
			
		}
		
	}

}
