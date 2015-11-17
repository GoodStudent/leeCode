package leeCode;

public class Solution005 {

	public static void main(String[] args) {
		String s = "aaaabaaa";
		System.out.println(longestPalindrome(s));

	}

	public static String longestPalindrome(String s) {
		int len = s.length();
		char[] ch = new char[len * 2 + 3];
		
		//每个字符中插入分割符'#'
		ch[0] = '^';
		ch[1] = '#';
		ch[ch.length - 1] = '$';
		for (int i = 0; i < len; i++) {
			ch[i * 2 + 2] = s.charAt(i);
			ch[i * 2 + 3] = '#';
		}
		
		//记录长度数组
		int[] p = new int[ch.length];
		p[0] = 1;  //首字符最大长度为1
		int id = 0;
		int mx = 0;
		int maxlen =  0;
		int maxid = 0;
		
		for(int i = 1; i < ch.length - 1; i++) {
			if(mx > i) {
				p[i] = Math.min(mx - i + 1, p[2 * id - i]);
			} else {
				p[i] = 1;
			}
			while(ch[i - p[i]] == ch[i + p[i]]){
				p[i]++;
			}
			if (i + p[i] - 1 > mx) {
				mx = i + p[i] - 1 ;
				id = i;
			}
			if (p[i] > maxlen) {
				maxlen = p[i];
				maxid = i;
			}
		}
		StringBuffer res = new StringBuffer();
		for(int i = maxid - maxlen + 1; i < maxid + maxlen; i++) {
			res.append(ch[i]);
		}

		return res.toString().replace("#","");
	}
		
}
