import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length-1;
        System.out.println("Before Merge sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        mergeSort(arr, 0, n);

        System.out.println();
        System.out.println("After Merge sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high) {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        ArrayList<Integer> arrayList =new ArrayList<>();
        while(left<=mid && right<=high) {
            if(arr[left]>=arr[right]) {
                arrayList.add(arr[right]);
                right++;
            }
            else {
                arrayList.add(arr[left]);
                left++;
            }
        }
        while(left<=mid) {
            arrayList.add(arr[left]);
            left++;
        }
        while(right<=high) {
            arrayList.add(arr[right]);
            right++;
        }

        for(int i=0;i<arrayList.size();i++) {
            arr[low+i] =arrayList.get(i);

        }
    }
}
