package com.yzx.middle;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author YZX
 * @date 2020年11月5日
 * @time 下午9:09:56
 */

public class Middel127 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord = null, endWord = null;
		LinkedList<String> wordList = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext())
			beginWord = sc.next();
		if(sc.hasNext())
			endWord = sc.next();
		while(sc.hasNext()) {
			String s = sc.next();
			if(s.equals("0")) break;
			wordList.offerLast(sc.next());
		}
		new Middel127().new Solution().ladderLength(beginWord, endWord, wordList);
	}
	class Solution {
	    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

	        return 0;
	    }
	}
}
