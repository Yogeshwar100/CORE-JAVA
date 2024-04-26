package collection;

import java.util.*;

public class VectorDemo02 {
	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.capacity());
		v.add("hi");
		v.add(10);
		v.add(151);
		System.out.println(v);
		System.out.println("==========");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Object s=e.nextElement();
			System.out.println("element: "+s);
		}
		System.out.println("Iterator implementing class Name:"+e.getClass().getName());

	}
}