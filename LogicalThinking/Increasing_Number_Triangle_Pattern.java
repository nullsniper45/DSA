import java.util.Scanner;

public class Increasing_Number_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 1;
        int num = sc.nextInt();
        for(int i=0;i<num;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(n++ +" ");
            }
            System.out.println();
        }
    }
}
