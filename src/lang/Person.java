package lang;

public class Person {

	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}
/*
	public boolean equals(Object obj) {
		try {
			if (this == obj)
				return true;
			//
			System.out.println(((Person)obj).id);
			//
			if (obj instanceof Person) {
				Person p = (Person) obj;
				if (this.id == p.id && this.name.equals(p.name)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			System.out.println("NullPointerException catch");
			return false;
		} 
	}

	//Simplified code
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (this.id == p.id && this.name.equals(p.name)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
*/
	public static void main(String[] args) {
		Person p1 = new Person(1012, "Ankita");
		Person p2 = new Person(1012, "Anita");
		Person p3 = p1;
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(null));
		System.out.println(p1.equals(p3));

		// StringBuffer and StringBuilder class .equals() method is not overridden
		StringBuffer sb = new StringBuffer("Sayali");
		StringBuffer sb1 = new StringBuffer("Sayali");
		System.out.println("........");
		System.out.println(sb.equals(sb1));
		StringBuilder sb2 = new StringBuilder("Sayali");
		StringBuilder sb3 = new StringBuilder("Sayali");
		System.out.println(sb2.equals(sb3));

	}

}
