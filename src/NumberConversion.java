public class NumberConversion {

    public static void main(String[] args) {
        System.out.println(convertNumber(1101));
    }

    public static int convertNumber(int n){
        int rem=0;
        int count=0;
        int sum=0;
        while(n!=0){
           rem=n%10;
           sum= (int) ((int)sum+Math.pow(2,count++)*rem);
           n=n/10;
        }
        return sum;
    }
}