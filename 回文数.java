package com.company;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int num = 0;
        while(num < x){
            num = num*10 + x%10;
            x/=10;
        }
        boolean b = (x==num)||(x==num/10);
        return b;
    }
}