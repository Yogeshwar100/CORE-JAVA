package lang;

public class MuttableDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Akash");

		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1.equals(sb2));// In StringBuffer class .equals() method is not overridden for content
											// comparison
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());

	}

}
