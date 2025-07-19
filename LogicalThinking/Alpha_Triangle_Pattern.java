import java.util.Scanner;

public class Alpha_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num-1;i>=0;i--) {
            for(int j=0;j<num-i;j++) {
                System.out.print((char)(65+i+j));
            }
            System.out.println();
        }
    }
}
