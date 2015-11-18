package leeCode;

public class Solution006 {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(convert(s,2));

	}

	public static String convert(String s, int numRows) {
		if (numRows < 2) {
			return s;
		}
		int len = s.length();
		StringBuffer[] str = new StringBuffer[numRows];
		for(int i = 0; i < numRows; i++) {
			str[i] = new StringBuffer();
		}
		int index = 0;
		boolean b = true;
		for(int i = 0; i < len; i++) {
			str[index].append(s.charAt(i));
			if (b) {
				index++;
			} else {
				index--;
			}
			if(index == numRows) {
				index =  index - 2;
				b = false;
			}
			if (index == 0) {
				b = true;
			}
		}
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < numRows; i++) {
			result.append(str[i]);
		}
		return result.toString();
	}

}
