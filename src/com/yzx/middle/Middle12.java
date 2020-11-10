package com.yzx.middle;

import java.util.Scanner;

/**
 * @author YZX
 * @date 2020年11月10日
 * @time 下午8:22:25
 */

public class Middle12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(sc.hasNextInt() && (num = sc.nextInt()) != 0) 
			System.out.println(new Middle12().new Solution().intToRoman(num));
	}
	class Solution {
	    public String intToRoman(int num) {
	    	StringBuilder sb = new StringBuilder();
	    	for(RomaNumber roma : RomaNumber.values()) {
	    		int val = roma.getN();
	    		if(num < val)
	    			continue;
    			num -= val;
    			sb.append(roma.name());
    			if(num == 0)
    				break;
	    	}
	    	return sb.toString();
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
