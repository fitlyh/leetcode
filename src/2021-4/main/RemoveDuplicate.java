package main;
public class RemoveDuplicate {
    public static void main(String argsp[]) {
        Solution soution = new Solution();
        int[] nums = {1, 2, 2, 3, 3, 4, 5};
        int result=soution.removeDuplicates(nums);
        System.out.println(result);
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}