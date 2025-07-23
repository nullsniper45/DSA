public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Insertion sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        for(int i=1;i<n;i++) {
            for(int j =i;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Insertion sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
