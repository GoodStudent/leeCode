package leeCode;

public class Solution007 {

	public static void main(String[] args) {
		int x = Integer.MAX_VALUE;
		System.out.println(x);

	}
	public static int reverse(int x) {
		boolean isNegative = x < 0;
		x = Math.abs(x);
		int res = 0 ;
		while(x != 0) {
			if (res != res * 10 /10) {
				return 0;
			}
			res =  res * 10 + x % 10;
			x = x / 10;
		}
		if (isNegative) {
			res= -1 * res;
		}
		return res;

	}

}
