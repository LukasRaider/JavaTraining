package Oops;

public class ChlidAddition extends Addition{

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.addValues(11, 11);
		addition.addValues(11,11, 11);
		
		addition.addValues(22, 22);
		double d = addition.addValues(11.11, 22.22);
				System.out.println(d);
	}

}
