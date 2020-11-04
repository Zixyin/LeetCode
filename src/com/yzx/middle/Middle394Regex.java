package com.yzx.middle;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Middle394Regex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		while(sc.hasNext() && (s = sc.next())!= "0")
			System.out.println(new Middle394Regex().new Solution().decodeString(s));
	}
	class Solution {
	    public String decodeString(String s) {
			String regex = "(\\d)+\\[([a-zA-Z])+\\]";
			Pattern p= Pattern.compile(regex);
			String ans = s;
			while(ans.contains("[")) {
				Matcher m = p.matcher(ans);
				if(m.find()) {
					String[] strArr = m.group().split("\\[");
					int cnt = Integer.parseInt(strArr[0]);
					String word = strArr[1].replace("]", "");
					StringBuilder sb = new StringBuilder();
					String words;
					while(cnt -- > 0)
						sb.append(word);
					words = sb.toString();
					ans = ans.replaceFirst("(\\d)+\\[([a-zA-Z])+\\]", words);
				}
			}
	    	return ans;
	    }
	}
}
