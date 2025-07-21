import java.util.Scanner;

public class Fibbonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("0, 1");
        fibo(num, a, b);

    }

    private static void fibo(int num, int a, int b) {
        if(num<=1){
            return;
        }
        int temp = a;
        a = b;
        b = b+temp;
        System.out.print(", "+b);
        fibo(num-1,a,b);

    }

}
