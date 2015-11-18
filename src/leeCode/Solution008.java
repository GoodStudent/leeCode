package leeCode;

public class Solution008 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(myAtoi("    10522545459"));

	}
	
	public static int myAtoi(String str) {
		str = str.trim();
		int res = 0;
		boolean isNegative = str.startsWith("-");
		if(str.length() > 1) {
			if (str.charAt(0) == '-' || str.charAt(0) == '+') {
				str  = str.substring(1);
			}
		}
		for(int i = 0; i < str.length();  i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				res = res * 10 + Character.getNumericValue(str.charAt(i));
			} else {
				break;
			}
			if (res < 0 && isNegative) return Integer.MIN_VALUE;
			if (res < 0 && !isNegative) return Integer.MAX_VALUE;
		}
		
		return isNegative ?  -res : res;
	}

}
