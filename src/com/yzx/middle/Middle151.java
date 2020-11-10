package com.yzx.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author YZX
 * @date 2020年11月10日
 * @time 下午9:28:01
 */

public class Middle151 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		while(sc.hasNext()) {
			s = sc.next();
			if(s.equals("0"))
				break;
		}
		System.out.println(new Middle151().new Solution().reverseWords(s));;
	}
	class Solution {
	    public String reverseWords(String s) {
	    	List<String> list = new ArrayList<>();
	    	list.addAll(Arrays.asList(s.split(" ")));
	    	Collections.reverse(list);
	    	return s;
	    }
	}
}
