package main;

public class PlusOne {
    public static void main(String args[])
    {
        int[] nums=new int[]{3,8,9};
        SolutionE solutionE=new SolutionE();
        int[] result=solutionE.plusOne(nums);
        System.out.println(result);
    }
}
class SolutionE{
    public int[] plusOne(int[] nums) {
        for(int i =nums.length-1; i >= 0; i--) {
            nums[i]++;
            nums[i] %= 10;
            if(nums[i]!=0)
                return nums;
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }
}
