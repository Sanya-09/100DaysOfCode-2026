package DSA.SanyaAgarwal_500120145.Day_1.Question1_Leetcode;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int s = 0;
        for(int i = 0 ; i < n ; i++){
            s = s + nums[i];
        }
        sum = sum - s;
        return sum;
    }
}

