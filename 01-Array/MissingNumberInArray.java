public class MissingNumberInArray{

    // main logic 
    public int missingNumber(int[] nums){
        int xorSum = 0;


        // xor with all the array elements 
        for(int n : nums){
            xorSum = xorSum ^ n;
        }



        // xor with all the element in range 
        int n = nums.length;
        for(int i = 0; i<=n; i++){
            xorSum = xorSum^i;
        }

        
        // answer 
        return xorSum;

    }








    public static void main(String[] args) {
        
    }
}