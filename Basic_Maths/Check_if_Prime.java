import java.util.Scanner;

public class Check_if_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num%i==0) {
                System.out.println("It is not a primenumber");
                break;
            }
            if(i==(int)Math.sqrt(num)) {
                System.out.println("It is a prime number");
            }
        }
    }
}
