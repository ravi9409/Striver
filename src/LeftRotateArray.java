public class LeftRotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int temp,previous = 0;
        int n=4;
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < nums.length; i++) {
                temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
        }
        for (int a1:nums
             ) {
            System.out.println(a1);
        }
    }
}