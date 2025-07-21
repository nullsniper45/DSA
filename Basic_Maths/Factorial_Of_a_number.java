import java.util.Scanner;

public class Factorial_Of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        sum = recursive(num, sum);
        System.out.println(sum);
    }

    public static int recursive(int num, int sum) {
        if(num<1) {
            return sum;
        }
        sum *= num;
        return recursive(num-1, sum);
    }
}
