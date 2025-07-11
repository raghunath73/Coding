package mergesotedarrays;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        /*int[] nums1 = {1,2,3,0,0,0};
        int m = 3, n = 3;
        int[] nums2 = {2,5,6}; */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of elements in the second array: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[m+n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < m; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        for(int i = 0;i<arr2.length;i++){
            arr1[m+i] = arr2[i];
        }
        Arrays.sort(arr1);
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        scanner.close();
    }
}
