import static java.lang.Math.min;
import java.util.*;

public class Basicmaths {
    // 1. Added 'int' returN type
    // 2. Used lowercase 'N' coNsisteNtly
    public static int count(int N) {
        int cnt = 0;
        while (N > 0) {
            cnt = cnt + 1;
            N = N / 10;
        }
        return cnt;
    }

    public static int reverse(int N) {

        int revNum = 0;
        while( N > 0) {
            int id = N % 10;
            revNum = (revNum * 10) + id;
            N = N / 10;
        }
        return revNum;
    }

    public static void  palindrome(int N) {
        int revNum = 0;
        int dup = N;
        while (N > 0){
            int id = N % 10;
            revNum = (revNum * 10) + id;
            N = N / 10;
        }

        if (dup == revNum){
            System.out.print("The Number is Palindrome");
        }else{
            System.out.print("The Number is not Palindrome");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        // int digit = reverse(N);
        palindrome(N);
        // System.out.println(digit);
        sc.close();
    }
}