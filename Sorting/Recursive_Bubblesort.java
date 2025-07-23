public class Recursive_Bubblesort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length-1;
        System.out.println("Before Recursive Bubblesort sort:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        recursive(arr, n);

        System.out.println();
        System.out.println("After Recursive Bubblesort sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void recursive(int[] arr, int n) {
        if(n<0) {
            return;
        }
        for(int i=0;i<n;i++) {
            if(arr[i]>arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        recursive(arr, n-1);
    }
}
