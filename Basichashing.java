import java.util.*;

public class Basichashing{

    


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Pre store the elements in the hash table
        int hash[] = new int[13];
        for(int i = 0; i < n; i++){
            hash [arr[i]] += 1;
        }

        int q = sc.nextInt();
        while(q-- != 0){
            int num;
            num = sc.nextInt();

            // fetching
        System.out.println(hash[num]);
        }
       sc.close();
    }
}