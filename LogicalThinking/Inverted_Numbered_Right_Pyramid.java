import java.util.Scanner;

public class Inverted_Numbered_Right_Pyramid  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++) {
            for(int j=num;j>i;j--) {
                System.out.print(num-j+1);
            }
            System.out.println();
        }
    }
}
