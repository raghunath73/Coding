package removeduplicatesfromsortedarray;
import java.util.HashSet;
import java.util.Scanner;
class Bruteforce{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: "+removeduplicatesfromsortedarray(arr));
        scanner.close();
    }
    public static int removeduplicatesfromsortedarray(int[] arr) {
        if(arr.length == 0) return 0;
        if(arr.length == 1) return 1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {  
            if (!hs.contains(arr[i])) {
                hs.add(arr[i]);
            }
        }
        return hs.size();
    }
}