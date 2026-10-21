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

    static void number(int i, int n){
        if(i > n) return;
        System.out.println(i);
        number(i+1,n);
    }

    static void printReverse(int i, int n){
        if(i < n) return;
        System.out.println(i);
        printReverse(i-1,n);
    }

    static void backtrack(int i){
        if(i < 1) return;
        backtrack(i - 1);
        System.out.println(i);

    }

    public static void main(String[] args) {
        // name(1,5);
        // number(1,10);
        // printReverse(10,1);
        backtrack(10);
    }
}
