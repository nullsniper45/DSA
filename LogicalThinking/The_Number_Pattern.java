import java.util.Scanner;

public class The_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int top = 0;
        int left = 0;
        int right  = 2*n-2;
        int bottom = 2*n-2;
        int[][] arr = new int[2*n-1][2*n-1];
        while(top<=bottom && left <= right) {
            for(int i =left;i<=right;i++) {
                arr[left][i] = n;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                arr[i][bottom]=n;
            }
            right--;
            for(int i=right;i>=left;i--) {
                arr[bottom][i]=n;
            }
            bottom--;
            for(int i = bottom;i>= top;i--) {
                arr[i][left] = n;
            }
            left++;
            n--;
        }


        for(int i=0;i< arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
