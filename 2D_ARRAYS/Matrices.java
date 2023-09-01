import java.util.Scanner;

public class Matrices {

    public static boolean search(int matrix[][],int num){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == num){
                    System.out.println(num +" found at index ("+i+','+j+')');
                   return true;
                }
            }
        }
        System.out.println(num + " not present in array.");
        return false;
        
        
    }

    public static void main(String[] args) {
        int matrices[][] = new int[3][3];
        int rows = matrices.length;
        int columns = matrices[0].length;

        Scanner sc = new Scanner(System.in);

        // inserting values in 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrices[i][j] = sc.nextInt();
            }
        }

        // printing 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrices[i][j]+" ");
            }
            System.out.println();
        }

        // seraching 
        search(matrices, 5);
    }
}
