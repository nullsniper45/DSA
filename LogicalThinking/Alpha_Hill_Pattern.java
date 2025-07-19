import java.util.Scanner;

public class Alpha_Hill_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++) {
            for(int j=num;j>i;j--) {
                System.out.print("-");
            }
            int a = 0;
            for(int j=0;j<2*i+1;j++) {

                a =  j<=(2*i+1)/2 ? 65+j: --a;
                System.out.print((char) a);
            }

            System.out.println();
        }
    }
}
