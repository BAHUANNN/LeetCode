package com.company;

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int b = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = Integer.MIN_VALUE;
                b++;
            }
        }
        for (int i = 0,j = 0; i < nums.length;i++) {
            if(nums[i] != Integer.MIN_VALUE){
                nums[j] = nums[i];
                j++;
            }
        }
        return nums.length-b;
    }
}
