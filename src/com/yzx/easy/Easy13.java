package com.yzx.easy;

import java.util.Scanner;

import com.yzx.easy.Easy941.Solution;

/**
 * @author YZX
 * @date 2020年11月4日
 * @time 上午7:13:25
 */

public class Easy13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		while((sc.hasNext() && (s = sc.next()) != "0") 
			System.out.println(new Easy13().new Solution().romanToInt(s));
	}
	class Solution {
	    public int romanToInt(String s) {
	    	int ans = 0;
	    	for(RomaNumber num : RomaNumber.values()) {
	    			if(s.contains(num.name()))
	    				s = s.replace(num.name(), "");
	    			ans += num.getN();
	    	}
			return ans;
	    }
	}
	enum RomaNumber {
		MCCC(1300),
		MCC(1200),
		MC(1100),
		M(1000),
		CM(900),
		DCCC(800),
		DCC(700),
		DC(600),
		D(500),
		CD(400),
		CXXX(130),
		CXX(120),
		CX(110),
		C(100),
		XC(90),
		LXXX(80),
		LXX(70),
		LX(60),
		L(50),
		XL(40),
		XIII(13),
		XII(12),
		XI(11),
		X(10),
		IX(9),
		VIII(8),
		VII(7),
		VI(6),
		V(5),
		IV(4),
		III(3),
		II(2),
		I(1)
		;
		private int N;
		private RomaNumber(int N) {
			this.N = N;
		}
		public int getN() {
			return N;
		}
	}
}
