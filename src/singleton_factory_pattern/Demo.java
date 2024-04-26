package singleton_factory_pattern;

class Test {

	private static Demo t = null;

	private Test() {
		
	}
	
	public static Demo getTestObj() {

		if (t == null) {
			t = new Demo();
		}
		return t;
	}
}

public class Demo {
	public static void main(String[] args) {
		System.out.println(Test.getTestObj().hashCode());
		System.out.println(Test.getTestObj().hashCode());

	}

}
