import java.util.Arrays;
import java.util.Scanner;

public class Recursive_ifPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt =0;
        System.out.println(recursive(str, cnt));
    }

    public static boolean recursive(String str, int cnt) {
        if(cnt>= str.length()/2) {
            return true;
        }
        if(str.charAt(cnt) != str.charAt(str.length()-1-cnt)) {
            return false;
        }
        return recursive(str, cnt+1);
    }
}
