import java.util.*;

public class MapHashing{

    static Scanner sc = new Scanner(System.in);

    static int getFrequency(int n, int arr[]){
      
       //Pre Computing the frequency of each element in the array

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int value = 0;

            if(mp.containsKey(key)) value = mp.get(key);
            value++;
            mp.put(key, value);
        }

        //Iterate Over The Map

        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            System.out.println(it.getKey() + "-> " + it.getValue());
        }
        
        int q = sc.nextInt();
        while(q-- != 0){
            int numbers = sc.nextInt();

            //Fetching the value
            if(mp.containsKey(numbers)) System.out.println(mp.get(numbers));
            else System.out.println(0);

        }
        return 0;
    } 

    

    public static void main(String[] args ){

        

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        getFrequency(n, arr);

    }
}