import java.util.Scanner;

public class Nto1_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        recursive(num);
    }

    public static void recursive(int num) {
        if(num<0) {
            return;
        }
        System.out.println(num);
        recursive(num-1);
    }
}
