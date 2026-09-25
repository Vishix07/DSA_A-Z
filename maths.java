import static java.lang.Math.min;
import java.util.*;

public class maths {
    // 1. Added 'int' return type
    // 2. Used lowercase 'n' consistently
    public static int count(int n) {
        int cnt = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Digit count: " + count(number));
    }
}