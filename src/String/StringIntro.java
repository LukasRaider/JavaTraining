package String;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Anabul Chauhan";
		String name1 = "Anabul Chauhan";
		String name2 = "anshul chauhan";
		
		String country = new String("United State");
		String country1 = new String("United State");
		/*
		System.out.println(name);
		System.out.println(country);
		*/
		/*
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name == name1);
		System.out.println(country == country1);
		*/
		
		String finalString = name + name1 + name2;
		System.out.println(finalString);
		
		String secString = name.concat(name1).concat(name2);
		System.out.println(secString);
		
	}

}
