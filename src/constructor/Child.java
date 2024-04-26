package constructor;

class Parent {
	public Parent(int a, String s1) {
		this.a = a;
		this.s1 = s1;
	}

	int a;
	String s1;
}

public class Child extends Parent {
	int c = 10;

	public Child(int a, int c, String s1) {
		super(a, s1);
		this.c = c;

	}

	public static void main(String[] args) {
		Child c = new Child(20, 30, "dd");
		System.out.println(c.a + " " + c.c + " " + c.s1);

	}

}
