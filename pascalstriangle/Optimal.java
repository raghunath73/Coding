package pascalstriangle;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = scanner.nextInt();
        scanner.close();
        int[][] triangle = generatePascalTriangle(n);
        printPascalTriangle(triangle, n);
    }
    public static void printPascalTriangle(int[][] arr, int n) {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generatePascalTriangle(int n) {
        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        for(int i = 2;i<n;i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
            for(int j = 1;j<i;j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr;
    }
}
