package com.yzx.middle;

import java.util.Collections;
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
		int ptr;
	    public String decodeString(String s) {
	    	LinkedList<String> stack = new LinkedList<String>();
	    	char c;
	    	while(ptr < s.length()) {
	    		c = s.charAt(ptr);
	    		if(Character.isDigit(c)) {
	    			stack.offerLast(getDigit(s));
	    		} else if(Character.isLetter(c) || c == '[') {
	    			stack.offerLast(String.valueOf(s.charAt(ptr ++)));
	    		} else {
	    			StringBuffer sb = new StringBuffer();
	    			LinkedList<String> tmp = new LinkedList<>();
	    			String letter, word;
	    			while(!(letter = stack.pollLast()).equals("[")) 
	    				//只能用栈处理，不然[]嵌套里面的字符串顺序会反
	    				tmp.addLast(letter);
	    			int cnt = Integer.parseInt(stack.pollLast());
	    			word = getString(tmp);
	    			while(cnt -- > 0)
	    				sb = sb.append(word);
	    			stack.offerLast(sb.toString());
	    			++ ptr;
	    		}
	    	}
	    	Collections.reverse(stack);
	    	return getString(stack);
	    }
	    public String getDigit(String s) {
	    	StringBuffer num = new StringBuffer();
	    	while(Character.isDigit(s.charAt(ptr)))
	    		num.append(s.charAt(ptr ++));
	    	return num.toString();
	    }
	    public String getString(LinkedList<String> list){
	    	StringBuilder sb = new StringBuilder();
	    	while(!list.isEmpty())
	    		sb.append(list.pollLast());
	    	return sb.toString();
	    }
	}
}
