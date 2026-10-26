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

    static int getMaxAndMinFreq(int n, int arr[]){

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the Frequency
        for(int i = 0; i < n; i++){
            map.put( arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int MaxFreq = 0, MinFreq = n;
        int MaxElement = 0, MinElement = 0;

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            int element = it.getKey();
            int count = it.getValue();

            if(count > MaxFreq){
                MaxFreq = count;
                MaxElement = element;
            }

            if(count < MinFreq){
                MinFreq = count;
                MinElement = element;

            }
        }

        // Print the Max and Min Frequency Elements
        System.out.println("Max Frequency Element: " + MaxElement + "->" + MaxFreq);
        System.out.println("Min Frequency Element:" + MinElement + "->" + MinFreq);
        return 0;
    }

    

    public static void main(String[] args ){

        

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        getFrequency(n, arr);
        getMaxAndMinFreq(n, arr);
    }
}