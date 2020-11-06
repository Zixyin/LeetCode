package com.yzx.middle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Middle8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
			System.out.println(new Middle8().new Solution().myAtoi(s));
	}
	class Solution {
	    public int myAtoi(String s) {
			s = s.trim();
	    	Pattern p1 = Pattern.compile("\\d|-|\\+");
	    	if(!p1.matcher(s).lookingAt())
	    		return 0;
			List<String> list = new ArrayList<>();
			String min  = String.valueOf(Integer.MIN_VALUE).substring(1);
			String max = String.valueOf(Integer.MAX_VALUE);

			boolean flag = false;
			if(s.startsWith("-")) {
				s = s.substring(1);
				flag = true;
				list.add(min);
			} else if(s.startsWith("+")){
					s = s.substring(1);
					list.add(max);
			} else {
				list.add(max);
			}
			Pattern p2 = Pattern.compile("^0*(\\d+)");
	    	Matcher m = p2.matcher(s);
	    	while(m.find())
	    		list.add(m.group(1));
//			System.out.println(list);
	    	if(list.size() == 1)
	    		return 0;
			Collections.sort(list, (s1, s2) -> {
				if(s1.length() != s2.length())
					return s2.length() - s1.length();
				return s2.compareTo(s1);
			});
			if(flag) {
				if(!list.get(0).equals(min))
					return Integer.MIN_VALUE;
				else if(!list.get(1).equals(min)) 
					return Integer.parseInt(list.get(list.indexOf(min) + 1))* (-1);			
				else return Integer.MIN_VALUE;
			}
			if(!list.get(0).equals(max)) 
				return Integer.MAX_VALUE;
			else return  Integer.parseInt(list.get(list.indexOf(max) + 1));
	    }
	}
}
