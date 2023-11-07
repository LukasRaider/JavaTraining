package String;

public class StringBufferIntro {

	public static void main(String[] args) {
		String name = "Anabul";
		name.concat("Chaichan");
		
		
		System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("Anabul");
		name1.append("Chauchan");
		
		name1.insert(4, "Chauban");
		
		name1.replace(1,3, " CHaulan ");
		System.out.println(name1);
		name1.delete(4, 7);
		System.out.println(name1);
		name1.reverse();
		System.out.println(name1);
		
	}
	
}
