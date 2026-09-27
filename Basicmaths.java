
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        // int digit = reverse(N);
        // palindrome(N);
        // System.out.println(digit);
        // armstrong(N);
        // advdivisors(N);
        prime(N);
        sc.close();
    }
}