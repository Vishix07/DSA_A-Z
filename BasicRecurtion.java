import java.util.*;

public class BasicRecurtion {
    static int cnt = 0;

    static void print() {
        if (cnt == 3) return;
        System.out.println(cnt);
        cnt++;
        print();
    }

    static void name(int i, int n){
        if(i > n) return;
        System.out.println("VISHI");
        name(i + 1, n);
    }

    public static void main(String[] args) {
        name(1,5);
    }
}
