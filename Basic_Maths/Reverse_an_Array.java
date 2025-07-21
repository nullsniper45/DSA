import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] starr = str.split(",");
        int[] arr = Arrays.stream(starr).mapToInt(Integer::parseInt).toArray();
        int cnt = 0;
        recursive(arr, cnt);
        for(int i =0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void recursive(int[] arr, int cnt) {
        if(cnt>= arr.length/2) {
            return;
        }
        int temp = arr[cnt];
        arr[cnt] = arr[arr.length-1-cnt];
        arr[arr.length-1-cnt] = temp;
        recursive(arr, cnt+1);
    }
}
