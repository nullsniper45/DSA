public class Recurive_Selectionsort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length-1;
        System.out.println("Before Recursive Selection sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        recursive(arr, n);

        System.out.println();
        System.out.println("After Recursive Selection sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void recursive(int[] arr, int n) {
        if(n<0) {
            return;
        }
        int maxindex = 0;
        for(int i=0;i<n;i++) {
            if(arr[i]>arr[maxindex]) {
                maxindex = i;
            }
        }
        int temp = arr[maxindex];
        arr[maxindex]= arr[n];
        arr[n] = temp;
        recursive(arr, n-1);
    }
}
