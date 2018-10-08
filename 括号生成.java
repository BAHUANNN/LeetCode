package com.company;

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        if(n == 0)return l;

        draw(0,0,"",l,n);
        return l;
    }

    public void draw(int left,int right,String s,List<String> a,int n){
        if(left == n && right == n){
            a.add(s);
            return;
        }

        if(left < n){
            draw(left+1,right,s+"(",a,n);
        }

        if(left > right){
            draw(left,right+1,s+")",a,n);
        }
    }
}