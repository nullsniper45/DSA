import java.util.Scanner;

public class GCD_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = Math.max(num1,num2);
        int b = Math.min(num1, num2);
//        int res =0;
        while (a%b !=0) {
            int temp =b;
            b=a%b;
            a =temp;
        }
        System.out.println(b);
    }
}
