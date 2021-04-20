package main;

public class maxSubArray {
    public static void main(String[] args)
    {
        int[] nums={4,2,5,-3,1,9};
        SolutionD solutionD=new SolutionD();
        int result=solutionD.maxSubArray(nums);
        System.out.println(result);
    }
}

class SolutionD {
    public int maxSubArray(int[] nums) {
        int temp = 0;
        int res = nums[0];
        for(int num : nums){
            temp = Math.max(temp + num, num);
            res = Math.max(res, temp);
        }
        return res;
    }
}

