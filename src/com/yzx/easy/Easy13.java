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
		while(sc.hasNext() && (s = sc.next()) != "0") 
			System.out.println(new Easy13().new Solution().romanToInt(s));
	}
	class Solution {
	    public int romanToInt(String s) {
	    	int ans = 0;
	    	for(RomaNumber num : RomaNumber.values()) {
	    			if(s.startsWith(num.name())) {
//	    				System.out.println(num.name() + " : " + num.getN());
	    				s = s.replaceFirst(num.name(), "");
	    				ans += num.getN();
	    			}
	    	}
			return ans;
	    }
	}
	enum RomaNumber {
		MMM(3000),
		MM(2000),
		M(1000),
		CM(900),
		DDD(1500),
		DD(1000),
		D(500),
		CD(400),
		CCC(300),
		CC(200),
		C(100),
		XC(90),
		LLL(150),
		LL(100),
		L(50),
		XL(40),
		XXX(30),
		XX(20),
		X(10),
		IX(9),
		VVV(15),
		VV(10),
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
