package String;

public class StringMethodPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Hello team";
		String sample = "His name is John and he is a good man";
		
		
		String text1 = text.replace("e", "a");
		String sample2 = sample.replace("is", "was");
		String[] sampletest = sample.split(" ");
		
		for (int i=0; i < sampletest.length;i++)
		{
			System.out.println(sampletest[i]);
		}
		
		
		
		System.out.println(text1);
		System.out.println(sample2);
		
		System.out.println(sample.startsWith("H"));
	}

}
