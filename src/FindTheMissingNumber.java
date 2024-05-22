import java.util.*;
public class FindTheMissingNumber {
    //Brute Force Approach O(n^2)
    /*public static int missingNumber(int[] a) {
        for (int i = 1; i <= a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }*/
    //Better Approach O(n)
    /*public static int missingNumber(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        int var=0;
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
            if(!set.contains(a[i])) {
               break;
            }
            var=i;
        }
        return var;
    }*/

    //Optimal Approach
    public static int missingNumber(int[] a) {
        int sum=0;
        sum=sum+((a.length+a.length+1)/2);
        return sum;
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 4, 5};
        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }

}