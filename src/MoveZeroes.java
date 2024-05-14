public class MoveZeroes {
    public static int[] moveZeros(int a, int[] num) {
        int i = 0;
        int j = 0;
        int temp = 0;
        for (; i < num.length; i++) {
            if (num[i] == 0)
                continue;
            else if (num[i] != 0) {
                temp = num[j];
                num[j] = num[i];
                num[i] = temp;
                j++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}