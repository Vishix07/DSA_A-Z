
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

    public static int odd(int N) {
        int cnt = 0;
        while(N > 0){
            int id = N % 10;
            if(id % 2 !=0){
                cnt++;
            }
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

    public static int largedig(int N) {
        int large = 0;
        while( N > 0){
            int id = N % 10;
            if(id > large){
                large = id;
            }
            N = N / 10;
        } 
        return large;
    }

    public static void palindrome(int N) {
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

    public static void armstrong(int N) {
        int dup = N;
        int sum = 0;
        while( N > 0){
            int id = N % 10;
            sum = sum + (id * id * id);
            N  = N / 10;
        }

        if( dup == sum){
            System.out.print("The Number is Armstrong");
        }else{
            System.out.print("The Number is Not Armstrong");
        }
    }

    public static void perfectNum(int N) {
        int total = 1;
        for(int i = 2; i*i <= N; i++){
            if( N % i == 0){
                total += i;

                if((N/i)!= i){
                    total += (N/i);
                }       
            }
        }
        if(total == N){
                    System.out.print("Its an Perfect Number");
                }else{
                    System.out.print("Its not an Perfect Number");
                }
    }

    public static void divisors(int N) {
        for(int i = 1; i <= N; i++){
            if( N % i == 0){
                System.out.print(i + " ");
            }
            
        }
    }

    public static void advdivisors(int N) {
         List<Integer> ls = new ArrayList<>();

         for(int i = 1; i <= Math.sqrt(N); i++){
            if(N % i == 0) {
                ls.add(i);

                if((N / i)!= i){
                    ls.add(N / i);
                }
            }
         }

         Collections.sort(ls);

         for(int it : ls){
            System.out.print(it + " ");
         }
         System.out.println();


    }

    public static void prime(int N) {
        int cnt = 0;
        for(int i = 1; i*i <= N; i++)
         if(N % i == 0){
            cnt++;

            if((N / i)!= i){
                cnt++;
            }
         }
         if(cnt == 2){
            System.out.print("Its an Prime Number");
         }else{
            System.out.print("Its not an Prime Number");
         }
    }
    
    public static void primetilln(int N) {
        int cnt = 0;
        for(int i = 2; i <=  N; i++){
            int pr = 0;
            for(int j = 1; j*j <= i; j++){
                if(i % j == 0){
                    pr++;

                    if((i/j)!=j){
                        pr++;
                    }
                }
            } if( pr == 2){
                cnt++;
            }
        } System.out.print(cnt);
    }

    public static void gcd(int A, int B) {
        while (A > 0 && B > 0) {
            if(A > B){
                A = A % B;
            }else{
                B = B % A;
            }
           
        }
         if(A == 0){
                System.out.print(B);
            }else{
               System.out.print(A);
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // int A = sc.nextInt();
        // int B = sc.nextInt();


        // System.out.print( count(N));
        // System.out.print(odd(N));
        // System.out.print(reverse(N));
        //  System.out.print(largedig(N));
        // palindrome(N);
        // System.out.println(digit);
        // armstrong(N);
        // perfectNum(N);
        // advdivisors(N);
        // prime(N);
        // primetilln(N);
        // gcd(A, B);
        sc.close();
    }
}