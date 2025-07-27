import java.util.Arrays;

public class Largest_Element_array {
    public static void main(String[] args) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: " + sort(arr1));

        System.out.println("The Largest element in the array is: " + recursive(arr1, 0, 0));

    }

    static int recursive(int arr[], int index, int maxele) {
        if(index>arr.length-1) {
            return maxele;
        }
        if(maxele<arr[index]) {
            maxele = arr[index];
        }
        return recursive(arr,index+1, maxele);
    }
    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
