import java.util.Scanner;

public class Symmetric_Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=0;j<2*(num-i-1);j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=0;i<num;i++) {
            for(int j=num;j>i;j--) {
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++) {
                System.out.print(" ");
            }
            for(int j=num;j>i;j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
