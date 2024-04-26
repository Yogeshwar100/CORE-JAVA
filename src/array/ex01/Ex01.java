package array.ex01;

public class Ex01 {

	public static void main(String[] args) {
		int[][] myArr = { { 10, 20, 30 }, { 40, 50 } };

		// normal for loop
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				System.out.println(myArr[i][j]);
			}
		}
		System.out.println("=================");
		// enhanced for loop
		for (int[] x : myArr) {
			for (int x1 : x) {
				System.out.println(x1);
			}
		}
		
		int x=10;
		myLabledBlock:{
			System.out.println("Begin of labeled block");
			if(x==10)
				//break myLabledBlock;
			System.out.println("End of labeled block");
		}
		System.out.println("Hello.......");
//		System.out.println(10/0);//RE:AE / 0
//		System.out.println(0/0);//RE:AE / 0
		
//		System.out.println(10/0.0);//Infinity
//		System.out.println(10.0/0);//Infinity
//		System.out.println(-10/0.0);//-Infinity
//		System.out.println(-10.0/0);//-Infinity
		
//		System.out.println(0/0.0);//Nan
//		System.out.println(-0/0.0);//Nan
		
//		System.out.println(10.0/2.0);//5.0
		
		System.out.println(0/2);
	}

}
