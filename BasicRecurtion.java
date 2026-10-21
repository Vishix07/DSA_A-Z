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

    static void backtrack2(int i, int n){
        if(i > n) return;
        backtrack2(i + 1, n);
        System.out.println(i);
    }

    static void sum(int i,int n){
        if(i < 1){
            System.out.println(n);
            return;
        } 
        sum(i - 1, n + i);
    }

    static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n - 1);
            
        
    }

    static int sumUsingRecursion(int n){
        if(n == 0) return 0;
        return n +  sumUsingRecursion(n - 1);
       
    }

    public static void main(String[] args) {
        // name(1,5);
        // number(1,10);
        // printReverse(10,1);
        // backtrack(10);
        // backtrack2(1,10);
        //  sum(5,0);
        // factorial(13);
        // System.out.println(sumUsingRecursion(5));
        System.out.println(factorial(5));
    }
}
