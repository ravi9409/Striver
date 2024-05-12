public class LargestAndSecondLargestInArray {
    public static void main(String[] args) {
        int[] array = {1, 8, 7, 561, 90};
        //System.out.println(largest(array, array.length));
        System.out.println(secondLargest(array, array.length));
    }

    public static int largest(int arr[], int n) {
        int max = 0;
        int secondLargest=-1;
        //This is the main logic to get largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i=0;i<arr.length;i++){
            //This is the main logic to get second largest
            if (arr[i]>secondLargest && arr[i]!=max)
                secondLargest=arr[i];
        }
        return secondLargest;
    }

    //Optinmal Solution to get second largest
    public static int secondLargest(int arr[], int n) {
        int max = arr[0];
        int secondLargest=-1;
        //This is the main logic to get largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }else if (arr[i]<max && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}