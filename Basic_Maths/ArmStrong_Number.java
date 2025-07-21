import java.util.Scanner;

public class ArmStrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int res =0;
        while(num>0) {
            res += Math.pow(num%10, 3);
            num = num/10;
        }
        if ((res == temp)) {
            System.out.println("ArmStrong number");
        } else {
            System.out.println("Not an armStrong Number");
        }
    }
}
