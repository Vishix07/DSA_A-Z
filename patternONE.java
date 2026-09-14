import java.util.*;

// public class patternON {
    
//     public static void main (String[] args){
//         int i = 0;
//         int j = 0;
//         for ( i=0; i<4; i++){

//              for (j=0; j<4; j++){
//                 System.out.print("*");
        
//             }

//             System.out.println("");
//         }

//     }
// }



class patternONE {

    public void pattern1 (int N){
        for (int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("*");
            }

          System.out.println();
        }
    }
    
    public void pattern2 (int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        patternONE sol = new patternONE();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for(int i=0; i<t;i++){
            int N = scan.nextInt() ;
            sol.pattern2(N);
        }
       scan.close();
    }
}
