package com.company;

import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for(int i = len-1 ; i > 0 ;i--){
            if (nums[i] > nums[i-1] ){
                for(int j = i ; j < len; j++ ){
                    if(nums[j] - nums[i-1] > 0 && (j == len-1 || nums[j+1] - nums[i-1] <= 0 )){
                        swap(nums,i-1,j);
                        reverse(nums,i);
                        return;
                    }
                }
            }
        }
        reverse(nums,0);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
