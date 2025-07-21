import java.util.Scanner;

public class Print_1toN_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        recursive(num);
    }

    public static int cnt = 1;

    public static void recursive(int num) {
        if(cnt>num) {
            return;
        }
        System.out.println(cnt++);
        recursive(num);
    }
}

