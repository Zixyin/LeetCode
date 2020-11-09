package com.yzx.easy;

import java.util.Scanner;

import com.yzx.easy.Easy13.Solution;

/**
 * @author YZX
 * @date 2020年11月8日
 * @time 下午8:10:45
 */

public class Easy122 {
	public static void main(String[] args) {
		int[] prices = {1,2,3,4,5};
		System.out.println(new Easy122().new Solution().maxProfit(prices));
	}
	class Solution {
	    public int maxProfit(int[] prices) {
	    	int ans = 0;
	    	if(prices.length < 2)
	    		return ans;
	    	int cusor = prices[0];
	    	for(int i  = 1;i < prices.length;++ i) {
	    		int plus = prices[i] - cusor;
	    		if(plus > 0) 
	    			ans += plus;
    			cusor = prices[i];
	    	}
	        return ans;
	    }
	}
}
