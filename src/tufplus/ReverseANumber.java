package tufplus;

public class ReverseANumber {
    public static void main(String[] args) {
        int a = 256;
        System.out.println(reverseNumber(a));
    }

    public static int reverseNumber(int n) {
        int revNum = 0;
        int lastDigit = 0;
        while (n != 0) {
            lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        return revNum;
    }
}