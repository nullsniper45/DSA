import java.util.Scanner;

public class Right_Angled_Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
