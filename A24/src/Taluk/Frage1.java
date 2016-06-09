package Taluk;

public class Frage1 {
	public static int lukasRec(int n) {
		if(n > Integer.MAX_VALUE) throw new ArithmeticException();
		if(n < 0) throw new IllegalArgumentException();
		if(n == 0) return 2;
		if(n == 1) return 1;
		return lukasRec(n-1) + lukasRec(n-2);
		
	}
		
	public static long fiboArr(int n) {
		if(n > Integer.MAX_VALUE) throw new ArithmeticException();
		if(n < 0) throw new IllegalArgumentException();
		int[] fibo = new int[2];
		fibo[0] = 1;
		fibo[1] = 2;
		for (int i=0; i < n; i++) {
			int[] newArr = new int[fibo.length+1];
			for(int j=0; j < newArr.length-1; j++) {
				newArr[j] = fibo[j];
			}
			newArr[newArr.length -1] = newArr[newArr.length - 2] +  newArr[newArr.length - 3];
			fibo = newArr;
		}
		return fibo[fibo.length - 2];
	}
}
		
	

