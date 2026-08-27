public class subArraySum{


    // main logic ---leetcode
    public int maxSumArray(int[] nums){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            
            //step1: sum create krte hai
            sum = sum + nums[i];

            // step2: maxi update kret hai
            maxi = Math.max(maxi, sum);

            // step3: sum check krte hai for negative value 
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }





    public static void main(String[] args) {
        
    }
}