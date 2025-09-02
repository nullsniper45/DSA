public class LeftRotate_array_byOne {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};
        int temp = arr[0];
        for(int i=1;i<arr.length;i++) {
            arr[i-1] =arr[i];
        }
        arr[arr.length-1] = temp;

        System.out.println("moving elements by one element: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        //Rotate Array by K places
        arr = new int[]{1, 2, 3, 4, 5};
        int k =2;
        reverseArray(arr, k-1);

        System.out.println("moving elements by k elements: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void reverseArray(int[] arr, int k) {
        reverse(arr, 0, k);
        reverse(arr,k+1, arr.length-1);
        reverse(arr, 0,arr.length-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
}

