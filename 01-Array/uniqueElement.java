public class uniqueElement{


    public static int findUniqueElement(int[] nums){
        // main logic 

        int xorSum = 0;

        for(int n : nums){
            xorSum = xorSum ^ n;
        }
        
        return xorSum;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 5, 3, 4};
        System.err.println(findUniqueElement(nums));
        
    }
}