package com.yzx.easy;

import java.util.Scanner;

public class Easy941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = {2, 1};
		System.out.println(new Easy941().new Solution().validMountainArray(A));
	}

	class Solution {
	    public boolean validMountainArray(int[] A) {
	    	int i = 0, len = A.length - 1;
	    	if(len < 2)
	    		return false;
	    	while(i < len && A[i] < A[i + 1])
	    		i++;
	    	if(i == 0 || i == len)
	    		return false;
	    	while(i < len && A[i] > A[i + 1])
	    		i ++;
	    	return i == len;
	    }
	}
}