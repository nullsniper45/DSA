import java.util.Scanner;

public class Reverse_Digits_of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res =0;
        while(num>0) {
            res = res*10+num%10;
            num = num/10;

        }
        System.out.println(res);
    }
}
