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
	    public String decodeString(String s) {
			Deque<Character> alphaQueue = new LinkedList<Character>();
			Deque<Integer> digitQueue = new LinkedList<Integer>();
			StringBuffer ans = new StringBuffer(), tmp;
			for(char c : s.toCharArray()) {
				if(Character.isDigit(c)) {
					tmp = new StringBuffer();
					while(!alphaQueue.isEmpty())
						tmp.insert(0, tmp);
					ans.append(tmp);
					digitQueue.offerLast(Integer.parseInt(s));
				} else if(c == '['){
					
				}
				else if(c == ']') {
					tmp = new StringBuffer();
					char out;
					while((out = alphaQueue.pollLast()) != '[') 
						tmp.insert(0, out);
					int cnt = digitQueue.pollLast();
					System.out.println(cnt);
					while(--cnt > 0) 
						tmp.append(tmp);
					ans.append(tmp);
				} else {
					alphaQueue.offerLast(c);
				}
			}
	    	return ans.toString();
	    }
	}
}
