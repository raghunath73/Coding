package mergesotedarrays;

import java.util.Scanner;

public class Optimal {
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
        mergesotedarrays(arr1, arr2, m, n);
        scanner.close();
    }
    public static void mergesotedarrays(int[] nums1, int[] nums2, int m, int n) {
        int j = n-1,i=m-1,k=m+n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
        while(i>=0){
            nums1[k--] = nums1[i--];
        }
        for(int x : nums1){
            System.out.print(x+" ");
        }
    }
}
