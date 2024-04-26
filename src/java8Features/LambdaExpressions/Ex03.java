package java8Features.LambdaExpressions;

import java.util.function.Predicate;

public class Ex03 {

	public static void main(String[] args) {
		String[] names= {"Sairaj","Ankit","Raj","Neha","Shruti","Sanket","Sahil"};
		
		Predicate<String> p=s ->s.length()>5;
		
		for(String s:names) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}
}
