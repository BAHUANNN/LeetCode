package com.company;

import java.nio.file.Paths;
import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == ')' && !stack.isEmpty() && s.charAt(stack.peek())=='('){
                stack.pop();
                if(stack.isEmpty()){
                    num = i+1;
                }else {
                    num = Math.max(num,i-stack.peek());
                    //难点在于记录上次最大值，（i-stack.peek）代表第二次的长度
                }
            }else {
                stack.push(i);
            }
        }
        return num;
    }
}
