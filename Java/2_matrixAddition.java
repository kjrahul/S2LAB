import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.print("Enter the rows and columns : ");
        rows = sc.nextInt();
        cols = sc.nextInt();

        int mat1[][] = new int[rows][cols];
        int mat2[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        System.out.println();
        System.out.println("Enter the elements of first matrix ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                mat1[i][j] =  sc.nextInt();
            }
        }  
        
        System.out.println();
        System.out.println("Enter the elements of second matrix ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                mat2[i][j] =  sc.nextInt();
            }
        } 

        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum[i][j] =  mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println();
        System.out.println("Sum of matrix 1 & matrix 2 is ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
