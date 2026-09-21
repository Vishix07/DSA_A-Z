import java.util.*;
import static java.lang.Math.min;

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

    public void pattern1(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void pattern2(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void pattern3(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    public void pattern4(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }

    public void pattern5(int N) {

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern6(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern7(int N) {
        for (int i = 0; i < N; i++) {
            // Space
            for (int j = 0; j <= N - i - 1; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j <= N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern8(int N) {
        for (int i = 0; i < N; i++) {
            // Space
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern9(int N) {
        pattern7(N);
        pattern8(N);
    }

    public void pattern10(int N) {
        for (int i = 1; i <= 2 * N - 1; i++) {
            int stars = i;
            if (i > N)
                stars = 2 * N - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int N) {
        int start;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }

    public void pattern12(int N) {
        int space = 2 * (N - 1);
        for (int i = 1; i <= N; i++) {
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // Numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public void pattern13(int N) {
        int num = 1;
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;

            }
            System.out.println();
        }
    }

    public void pattern14(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void pattern15(int N) {
        for (int i = 1; i <= N; i++) {
            for (char ch = 'A'; ch <= 'A' + (N - i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void pattern16(int N) {
        for (int i = 1; i <= N; i++) {
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public void pattern17(int N) {
        for (int i = 0; i < N; i++) {

            // Print leading spaces

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Initialize character to start from 'A'

            char ch = 'A';
            int Breakpoint = (2 * i + 1) / 2;
            // Print characters in row
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                // Increment or decrement character
                if (j <= Breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            // Print trailing spaces

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern18(int N) {
        for (int i = 0; i <= N; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void pattern19(int N) {
        int iniS = 0;
        for (int i = 0; i < N; i++) {
            // stars
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            iniS += 2;

            System.out.println();
        }
        iniS = 2 * (N - 1);
        for (int i = 1; i <= N; i++) {
            // stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            iniS -= 2;

            System.out.println();
        }

    }

    public void pattern20(int N) {
        int spaces = 2*N-2;
        
        for(int i=1; i<=2*N-1; i++){
            //Stars
            int stars = i;
            if(i > N)stars = 2*N-i;
        for(int j=1; j<=stars; j++){
            System.out.print("*");                
            }
        //Spaces
        for(int j=0; j< spaces; j++){
            System.out.print(" ");
        }
        //Stars
        for(int j=1; j<=stars; j++) {
            System.out.print("*");
        }
        System.out.println();
        if(i < N)spaces -= 2;
        else spaces += 2;
        }
    }

    public void pattern21(int N) {
        for(int i = 0; i < N; i++){
            //Stars
            for(int j = 0; j< N; j++){

                if(i == 0 || j == 0 || i == N-1 || j == N-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }

    public void pattern22(int N) {
        for(int i = 0; i < 2*N - 1; i++){
            for(int j = 0; j < 2*N - 1; j++){
                int top = i;
                int left = j;
                int right = (2*N - 2) - i;
                int bottom = (2*N - 2) - j;
                System.out.print(N - min(min(top,bottom),min(left,right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternONE sol = new patternONE();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int N = scan.nextInt();
            sol.pattern22(N);

        }
        scan.close();
    }
}
