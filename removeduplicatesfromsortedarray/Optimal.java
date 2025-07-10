package removeduplicatesfromsortedarray;
import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = removeduplicatesfromsortedarray(arr);
        System.out.println("Number of unique elements: " + result);
        scanner.close();
    }
    public static int removeduplicatesfromsortedarray(int[] arr) {
		int i = 0, j = 1;
		while(j<arr.length){
		    if(arr[i]<arr[j]){
		        int t = arr[i+1];
		        arr[i+1] = arr[j];
		        arr[j] = t;
		        i++;
		    }
		    j++;
		    
		}
		return i+1;
    }  

}
