package com.yzx.middle;

/**
 * @author YZX
 * @date 2020年11月9日
 * @time 下午10:32:56
 */

public class Middle6 {
	class Solution {
   	    public String convert(String s, int numRows) {
    	if(numRows == 1)
    		return s;
    	//完整竖列index差
    	int minus = numRows * 2 - 2;
    	//中间散列差
		int cent = minus - 2;
		int len = s.length();
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0;i < numRows; ++ i) {
    		int index = i;
    		while(index < len) {
    			sb.append(s.charAt(index));
    			//如果不是第一行和最后一行且不是最后一列
    			if(i != 0 && i != numRows - 1 && index + cent < len) 
	    			sb.append(s.charAt(index + cent));
    			index += minus;
    		}
    		if(i != 0 && i != numRows - 1)
    			cent -= 2;
    	}
    	return sb.toString();
    }
}
}
