package lang;

public class ImmutableDemo {

	public static void main(String[] args) {
		String s=new String("Hello All.");
		s.concat("Welcome");
		
		System.out.println(s);
		System.out.println(s.concat("Welcome."));
		
		String s1=s.concat("Hii.");
		System.out.println(s1);
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
