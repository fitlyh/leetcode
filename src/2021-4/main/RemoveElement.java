package main;

public class RemoveElement {
    public static void main(String[] args) {

    }
}

class SolutionA {
    public int removeElement(int[] nums, int val) {
        int p = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val) {
                nums[p]=nums[i];
                p++;
            }
        }
        return p;
    }
}
