import java.util.Scanner;

public class Increasing_Letter_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print( (char) (65+j) );
            }
            System.out.println();
        }
    }
}
