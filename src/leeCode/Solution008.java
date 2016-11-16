package leeCode;

public class Solution008 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(myAtoi("    10522545459"));

	}
	
	public static int myAtoi(String str) {
		int len = str.length();
		int i = 0;
		for(; i < len; i++) {
			if(str.charAt(i) != ' ') {
				break;
			} 
		}
		if(i == len) return 0;
		boolean isNegative = str.charAt(i) == '-';
		if (isNegative || str.charAt(i) == '+') {
			i++;
		}
		Long tmp = 0L;
		Long res = 0L;
		for(; i < len;  i++) {
			if(str.charAt(i) <  '0' || str.charAt(i) > '9') {
				break;
			} 
			tmp = tmp * 10 + Integer.parseInt(String.valueOf(str.charAt(i)));
			res = isNegative ? -tmp : tmp;
			if (res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if (res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		}
		
		return res.intValue();
	}

}
