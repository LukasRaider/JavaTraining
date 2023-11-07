package String;

public class StringMethodPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Learning is the key";
		
		String text1= "Hi We are learning from easybix.com";
		
		char ch=text.charAt(12);
		
		System.out.println(text.charAt(10));
		System.out.println(ch);
		
		
		String text2=text.concat(" to success ").concat(" and we learning Java");
		System.out.println(text2);
		
		System.out.println(text.contains(" is the "));
		
		System.out.println("Message ending with .com: " + text1.endsWith("m"));
		
	}

}
