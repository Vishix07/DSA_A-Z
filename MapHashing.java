import java.util.*;

public class MapHashing{


    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //Pre Computing the frequency of each element in the array

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int value = 0;
        

        if(mp.containsKey(key)) value = mp.get(key);
        value++;
        mp.put(key, value);

        }

        int q = sc.nextInt();
        while(q-- != 0){
            int numbers = sc.nextInt();

            //Fetching the frequency of the number from the map
            if(mp.containsKey(numbers)) System.out.println(mp.get(numbers));
            else System.out.println(0);
        }

    }
}