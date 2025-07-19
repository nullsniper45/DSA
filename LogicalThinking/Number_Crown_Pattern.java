import java.util.Scanner;

public class Number_Crown_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num-1;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(j+1);
            }
            for(int j=0;j<2*(num-i-2);j++) {
                System.out.print(" ");
            }
            for(int j=i+1;j>0;j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
