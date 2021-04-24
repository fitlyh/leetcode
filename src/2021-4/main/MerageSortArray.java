package main;

public class MerageSortArray {
    public static void main(String[] args)
    {
    int[] nums1=new int[]{1,2,3,3,7};
    int[] nums2=new int[]{2,3,4,8};
    SolutionF solutionF=new SolutionF();
    solutionF.merge(nums1,nums1.length,nums2,nums2.length);
    }
}
class SolutionF{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sum = m + n;
        int[] arr = new int[sum];
        int x = 0;
        for (int i = 0, j = 0; i < m || j < n; ) {
            if (i < m && j < n) {
                arr[x++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            } else if (i < m) {
                arr[x++] = nums1[i++];
            } else if (j < n) {
                arr[x++] = nums2[j++];
            }
        }
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y]);
        }
    }
}
