package java8Features.LambdaExpressions;

interface I1{
	public static void hello(){
		System.out.println("I1 hello()");
	}
}
interface I2{
	public static void hello(){
		System.out.println("I2 hello()");
	}
}
public class Ex01 implements I1,I2{

	public static void main(String[] args) {
		I1.hello();
		I2.hello();
	}

}
