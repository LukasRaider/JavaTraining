package ExceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int value=100;
		int result=value/0;
		
		String text=null;
		int lenght=text.length();
		
		}
		catch(ArithmeticException e){
			System.out.println("Declared Specific Excepsion");
		}catch(Exception e) {}
		System.out.println("Generic Catch Block");
	}

}
