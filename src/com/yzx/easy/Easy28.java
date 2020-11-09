package com.yzx.easy;

import java.util.Scanner;

public class Easy28 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String haystack = sc.next();
		String needle = sc.next();
		System.out.println(new Easy28().new Solution().strStr(haystack, needle));
	}
	
	class Solution {
	    public int strStr(String haystack, String needle) {
	    	int len1 = haystack.length(),len2 = needle.length();
	    	if(len2 == 0)
	    		return 0;
	    	int index = 0;
	    	while(index <= len1 - len2){
	    		if(haystack.charAt(index) == needle.charAt(0)) {
	    			int index2 = 0;
	    			while(index2 < len2) {
	    				if(haystack.charAt(index + index2) != needle.charAt(index2))
	    					break;
	    				index2 ++;
	    			}
	    			if(index2 == len2)
	    				return index;
	    		}
	    		++ index;
	    	}
	    	return -1;
	    }
	}
	
}
