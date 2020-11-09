package com.yzx.easy;

/**
 * @author YZX
 * @date 2020年11月8日
 * @time 下午8:44:28
 */

public class Easy122dp {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(new Easy122dp().new Solution().maxProfit(prices));
	}
	class Solution {
	    public int maxProfit(int[] prices) {
	    	int ans = 0;
	    	int hold = -prices[0];
	    	int holdNot = 0;
	    	for(int i = 1;i < prices.length;++ i) {
	    		int newHold = Math.max(hold, holdNot - prices[i]);
	    		int newHoldNot = Math.max(holdNot, hold + prices[i]);
	    		hold = newHold;
	    		holdNot = newHoldNot;
	    	}
	        return holdNot;
	    }
	}
}