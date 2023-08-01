package Matrix;

import java.util.Scanner;
import java.util.Locale;

public class matrix {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of lines and columns: \n");
        int n = sc.nextInt();

        //is like a vector ou a vector, this two [] made the matrix 
        int[][] mat = new int[n][n];

        System.out.println("Digit the numbers of the matrix: ");
        //the i read the lines and the j the columns 
        //you can use i<mat.length istead of i<n ; you can use j<mat[i].length istead of j<n
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for(int i=0; i<n ; i++){
            System.out.println(mat[i][i]);
        }

        //numbers that are negative

        int count = 0;
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count);

       



        
    }
}
