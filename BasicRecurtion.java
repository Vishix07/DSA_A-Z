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

    static void Reverse(int l, int r, int arr[]){
        
        if( l >= r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        Reverse(l +1, r - 1, arr);
    }

    static void Reverse2(int l, int arr2[], int n ){
        if( l >= n/2) return;
        int temp = arr2[l];
        arr2[l] = arr2[n-l-1];
        arr2[n-l-1] = temp;
        Reverse2(l + 1, arr2, n);
    }

    static boolean palindrome(int l, String str){
        if( l >= str.length()/2) return true;
        if ( str.charAt(l) != str.charAt(str.length() - l - 1)){
            return false;
        }
        return palindrome(l + 1, str);
    } 

    static int fibonacci(int n){
        if( n <= 1) return 1;
        int last = fibonacci(n - 1);
        int slast = fibonacci(n - 2);
        return last + slast;
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
        // System.out.println(factorial(5));

          //Reverse using 2 pointers 
         
        // int arr[] = {1,2,3,4,5};
        // Reverse(0, arr.length - 1, arr);
        // System.out.println(Arrays.toString(arr));

          // Reverse using 1 pointer

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr2[] = new int[n];

        // for(int i = 0; i < n; i++){
        //     arr2[i] = sc.nextInt();
        // }
        // Reverse2(0, arr2, n);
        // System.out.println(Arrays.toString(arr2));
        // sc.close();

        // String str = "racecar";
        // System.out.println(palindrome(0, str));

        int n = 25;
        for( int i = 0; i < n; i++){
        System.out.println(fibonacci(i));
        }
    }
}
