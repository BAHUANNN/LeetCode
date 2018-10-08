package com.company;

class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        String re = "";
        int len = s.length();

        for(int i=0;i <numRows;i++){
            int temp = i;
            if(i==0||i==numRows-1){
                while(temp<len){
                    re += s.charAt(temp);
                    temp += numRows*2-2;
                }
            }else{
                int b = 0;
                while(temp<len){
                    re += s.charAt(temp);
                    if(b%2==0){
                        temp += (numRows-1-i)*2;
                        b++;
                    }else{
                        temp += i*2;
                        b++;
                    }
                }
            }
        }
        return re;

    }
}