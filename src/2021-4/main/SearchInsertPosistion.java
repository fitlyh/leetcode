package main;

public class SearchInsertPosistion {
    public static void main(String[] args)
    {
        int[] nums={1,5,4,7,9};
        int target=8;
        SolutionC solutionC=new SolutionC();
        int result=solutionC.searchInsert(nums,target);
        System.out.println(result);
    }
}
class SolutionC {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}