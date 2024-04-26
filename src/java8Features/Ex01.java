package java8Features;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex01 {

	public static int squareOfNum(int x) {
		return x*x;
	}
	public static void main(String[] args) {
	
		System.out.println(squareOfNum(25));
		System.out.println("------------------------");
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(20));
		System.out.println("------------------------");
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
		System.out.println("------------------------");

	}

}
