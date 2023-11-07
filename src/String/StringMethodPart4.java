package String;

import java.security.KeyStore.CallbackHandlerProtection;

public class StringMethodPart4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "United State";
		
		System.out.println(text.substring(5));
		System.out.println(text.substring(5,9));
		
		System.out.println(text.substring(5,12));
		
		char[] charArray=text.toCharArray();
		System.out.println("Main string is " + text);
		
		for (int i=0; i< charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		
		System.out.println(text.toLowerCase());
		System.err.println(text.toUpperCase());
		
		String text1 = "My name is               ";
		String text2 = "               Anshul";
		System.out.println(text1+text2);
		System.out.println(text1.trim()+text2);
		System.out.println(text1.trim() + text2.trim());
	}

}
