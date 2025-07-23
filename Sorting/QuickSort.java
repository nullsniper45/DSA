public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length-1;
        System.out.println("Before Bubble sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Quicksort(arr, 0, n);

        System.out.println();
        System.out.println("After Quick sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void Quicksort(int[] arr, int i, int n) {
        if(i < n) {
            int partitionIndex = divide(arr, i, n);
            Quicksort(arr, i, partitionIndex-1);
            Quicksort(arr, partitionIndex+1, n);
        }
    }

    private static int divide(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j) {
            while(i<=high && arr[i]<=pivot) {
                i++;
            }
            while(j>=low && arr[j]>pivot) {
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                j--;
                i++;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j]= temp;
        return j;
    }
}
