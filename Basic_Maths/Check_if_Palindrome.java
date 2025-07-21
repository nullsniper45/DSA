import java.util.Scanner;

public class Check_if_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup = num;
        int res =0;
        while(num>0) {
            res = res*10+num%10;
            num = num/10;

        }
        if(dup == res) {
            System.out.println("The number "+dup+" is a Palindrome number");
        }
        else {
            System.out.println("The number "+dup+" is not a Palindrome number");
        }
    }
}
