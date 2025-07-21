import java.util.Scanner;

public class print_Ntimes_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        recursive(num, num);
    }

    public static void recursive(int num, int count) {
        if(count==0) {
            return;
        }
        System.out.println(num);
        recursive(num,count - 1);
    }
}
