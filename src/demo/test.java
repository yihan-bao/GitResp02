package demo;

public class test {
    public static void main(String[] args) {
        merge(new int[]{1,3,4,6,0,0},4,new int[]{2,7},2);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        for (int index = m + n - 1; index >= 0; index--) {
            if (index2 < 0) {
                for (int i : nums1) {
                    System.out.print(i+",");
                }
                return;
            }
            if (index1 < 0) {
                nums1[index] = nums2[index2--];
                System.out.println(nums1);
            }
            if (nums1[index1] > nums2[index2]) {
                nums1[index] = nums1[index1--];
                continue;
            }
            nums1[index] = nums2[index2--];
        }
    }
}
