package com.yzx.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author YZX
 * @date 2020年11月7日
 * @time 上午7:42:46
 */

public class Easy38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {

			int n = sc.nextInt();
			System.out.println(new Easy38().new Solution().countAndSay(n));
		}
	}
	class Solution {
	    public String countAndSay(int n) {
	    	String s = "1";
	    	String regex = "(\\d)\\1*";
	    	Pattern p = Pattern.compile(regex);
	    	while(-- n > 0) {
		    	Matcher m = p.matcher(s);
	    		StringBuilder sb = new StringBuilder();
	        	while(m.find()) {
	        		sb.append(m.group().length()).append(m.group().charAt(0));
	        	}
	        	s = sb.toString();
	    	}
	    	return s;
	    }
	}
}
