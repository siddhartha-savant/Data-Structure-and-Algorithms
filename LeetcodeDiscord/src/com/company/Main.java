package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}

// No. 22
class Solution{
    List<String> result = new ArrayList<String>();

    public List<String> generateParenthesis(int n){
        backtrack(n,"",0,0);
        return result;
    }

    private void backtrack(int n, String str, int openCount, int closeCount){
        if(str.length() == 2*n){
            result.add(str);
        }
        if(openCount<n){
            backtrack(n,str+"(",openCount+1,closeCount);
        }
        //if closeCount < n we will get all possible combinations like )))(((, ))()((, which we don't want
        if(closeCount<openCount){
            backtrack(n,str+")",openCount,closeCount+1);
        }
    }
}
