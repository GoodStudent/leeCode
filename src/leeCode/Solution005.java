package leeCode;

public class Solution005 {

	public static void main(String[] args) {
		String s = "1232132345678";
		System.out.println(longestPalindrome(s));

	}

	public static String longestPalindrome(String s) {
		int len = s.length();
		char[] ch = new char[len * 2 + 2];
		ch[0] = '$';
		ch[1] = '#';
		for (int i = 0; i < len; i++) {
			ch[i * 2 + 2] = s.charAt(i);
			ch[i * 2 + 3] = '#';
		}
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < ch.length; i++) {
			result.append(ch[i]);
		}
		return result.toString();
	}
		
}
