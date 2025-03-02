import java.util.Arrays;

public class LeftAndRIghtRotation {

    // Function to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to perform left rotation by d positions
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Function to perform right rotation by k positions
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        System.out.println("Original array: " + Arrays.toString(arr1));
        leftRotate(arr1, d);
        System.out.println("Array after left rotation by " + d + " positions: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        System.out.println("Original array: " + Arrays.toString(arr2));
        rightRotate(arr2, k);
        System.out.println("Array after right rotation by " + k + " positions: " + Arrays.toString(arr2));
    }
}
