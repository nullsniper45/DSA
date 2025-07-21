import java.util.Scanner;

public class Sum_of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        sum = recursive(num, sum);
        System.out.println(sum);
    }

    public static int recursive(int num, int sum) {
        if(num<0) {
            return sum;
        }
        sum += num;
        return recursive(num-1, sum);
    }
}
