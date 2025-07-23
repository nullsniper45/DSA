import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++) {
            int minval = arr[i];
            int minindex = i;
            for(int j=i;j<arr.length;j++) {
                if(arr[j]<minval) {
                    minval = arr[j];
                    minindex = j;
                }
            }
            if(minval!=arr[i]) {
                int temp = arr[i];
                arr[i] = minval;
                arr[minindex] = temp;
            }
        }
        System.out.println();
        System.out.println("after selection sort:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}




//TimeComplexity :O(N2)