package missingnumber;

public class Optimal {
    /*  
     My suggestion is know the difference between method1 and method2.
     * method2 is more efficient in terms of computational power. 
     * While method1 uses addition, multiplication, and division, 
     * which can be slightly heavier on the processor and may cause overflow for very large numbers,
     *  method2 only uses XOR operations. 
     * XOR is a fast and lightweight bitwise operation that doesn't cause overflow and runs very efficiently on modern CPUs. 
     * So, if you're working with very large arrays or want the most efficient method, method2 is the better choice.
    */
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        
        System.out.println("The missing number is: " + method1(nums));
        System.out.println("The missing number is: " + method2(nums));
    }
    public static int method1(int[] nums) {
        int n = nums.length, s = 0;
        int missingNumber = n*(n+1)/2;
        for(int i : nums){
            s+=i;
        }
        return missingNumber - s;
    }
    public static int method2(int[] nums) {
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            res ^= i ^ nums[i];
        }
        res ^= nums.length;
        return res;
    }
}

