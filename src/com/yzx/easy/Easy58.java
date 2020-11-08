package com.yzx.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author YZX
 * @date 2020年11月7日
 * @time 上午8:40:39
 */

public class Easy58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(new Easy58().new Solution().lengthOfLastWord(s));
		}
	}
	class Solution {
	    public int lengthOfLastWord(String s) {
	    	String[] arr = s.split(" ");
	    	if(arr.length == 0)
	    		return 0;
	    	return arr[arr.length - 1].length();
	    }
	}
}
