public class RightRotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int temp,previous = 0;
        int n=2;
        for (int j = 0; j < n; j++) {
            previous = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                temp = nums[i];
                nums[i] = previous;
                previous = temp;
            }
        }
        for (int a1:nums
        ) {
            System.out.println(a1);
        }
    }
}