package com.yzx.middle;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Middle394 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		while(sc.hasNext() && (s = sc.next())!= "0")
			System.out.println(new Middle394().new Solution().decodeString(s));
	}
	class Solution {
	    public String decodeString(String s) {
			String regex = "(\\d)+\\[([a-zA-Z])+\\]";
			Pattern p= Pattern.compile(regex);
			Matcher m = p.matcher(s);
			String ans = s;
			while(m.find()) {
				String[] strArr = m.group().split("\\[");
				int cnt = Integer.parseInt(strArr[0]);
				String word = strArr[1].replace("\\]", "");
				StringBuilder sb = new StringBuilder();
				while(cnt -- > 0)
					sb.append(word);
				word = sb.toString();
				ans = ans.replace("(\\d)+\\[([a-zA-Z])+\\]", word);
			}
	    	return ans;
	    }
	}
}
