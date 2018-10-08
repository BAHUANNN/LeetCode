package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = 0;
        int cha = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-2; i++){
            for (int j = i + 1; j < nums.length-1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    int tempCha = Math.abs(nums[i]+nums[j]+nums[k]-target);
                    if(tempCha == 0)return target;
                    if(tempCha < cha){
                        closest = nums[i]+nums[j]+nums[k];
                        cha = tempCha;
                    }
                }
            }
        }
        return closest;
    }
}