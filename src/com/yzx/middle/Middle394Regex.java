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
			String regex = "(\\d+)\\[([a-zA-Z]+)\\]";
			Pattern p= Pattern.compile(regex);
			String ans = s;
			while(ans.contains("[")) {
				Matcher m = p.matcher(ans);
				StringBuilder words = new StringBuilder();
				if(m.find()) {
					int cnt = Integer.parseInt(m.group(1));
					String word = m.group(2);
					while(cnt -- > 0)
						words.append(word);
				}
				ans = ans.replaceFirst(regex, words.toString());
			}
	    	return ans;
	    }
	}
}
