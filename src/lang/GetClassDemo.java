package lang;

import java.lang.reflect.Method;

public class GetClassDemo {

	public static void main(String[] args) {
		int count=0;
		Object o = new String();
		System.out.println(o.getClass().getName());
		Method[] m1 = o.getClass().getDeclaredMethods();
		for (Method m2 : m1) {
			count++;
			System.out.println(m2.getName());
		}
		System.out.println("Number of methods: "+count);

	}

}
