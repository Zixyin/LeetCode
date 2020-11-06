package com.yzx.middle;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author YZX
 * @date 2020年11月4日
 * @time 下午9:05:12
 */

public class Middle394Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		while(sc.hasNext() && (s = sc.next())!= "0")
			System.out.println(new Middle394Stack().new Solution().decodeString(s));
	}
	class Solution {
		//2[3[ab]10[c]a]
	    public String decodeString(String s) {

			return s;
	    }
	}
}
