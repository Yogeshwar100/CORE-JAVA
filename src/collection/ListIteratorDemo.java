package collection;

import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);// [balakrishna, venki, chiru, nag]
		System.out.println("======================================================");

		ListIterator listItr = l.listIterator();

		System.out.println("Forward Direction Iteration:");
		while (listItr.hasNext()) {
			String s = (String) listItr.next();
			if (s.equals("venki")) {
				listItr.remove();
			}
			if (s.equals("chiru")) {
				listItr.set("chran");
			}
			if (s.equals("nag")) {
				listItr.add("chitu");
			}
			System.out.println(s);

		}

		System.out.println(l);// [balakrishna, chran, nag, chitu]
		System.out.println("======================================================");

		System.out.println("Backward Direction Iteration:");
		while (listItr.hasPrevious()) {
			String s = (String) listItr.previous();
			System.out.println(s);

		}
		System.out.println("Iterator implementing class Name:"+listItr.getClass().getName());

		System.out.println(l);

	}
}