public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }


    public static int removeDuplicates(int[] arr){
        int n=arr.length;
        if (n==0)
            return 0;

        int insertIndex=1;
        for (int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]) {
              insertIndex++;
            }
        }
        return insertIndex;
    }

}