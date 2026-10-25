import java.util.*;

public class Basichashing{
    static Scanner sc = new Scanner(System.in);
    static void charHash(String str){

        int hash[] = new int[256];
        for(int i = 0; i < str.length(); i++){
            hash[str.charAt(i) - 'a']++;
        }

        int q = sc.nextInt();
        while(q-- != 0){
            char c;
            c = sc.next().charAt(0);

            // Fetching
            System.out.println(hash[c - 'a']);
        }
    }


    public static void main(String[] args){
       
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }

        // // Pre store the elements in the hash table
        // int hash[] = new int[13];
        // for(int i = 0; i < n; i++){
        //     hash [arr[i]] += 1;
        // }

        // int q = sc.nextInt();
        // while(q-- != 0){
        //     int num;
        //     num = sc.nextInt();

        //     // fetching
        // System.out.println(hash[num]);
        // }

        // CHARACTER HASHING 

        String str = sc.nextLine();

        charHash(str);

       sc.close();
    }
}