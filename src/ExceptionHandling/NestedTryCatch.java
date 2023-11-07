package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		String text= "Anahul";
		System.out.println(text.length());
		try{
			System.out.println("Second try catch block");
			try {
				System.out.println("Thrird try blok");
				int[] array= new int[3];
				array[5] =100;
			}
			catch(Exception e)
			{System.out.println("End od third try block");}
		}
catch(Exception e) {
	System.out.println("End Second try Block");
}

}catch(Exception e) {
	
	System.out.println("End of first try block");
	e.printStackTrace();
}

	}

}
