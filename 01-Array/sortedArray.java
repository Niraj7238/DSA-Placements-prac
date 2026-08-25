public class sortedArray{
    public static void main(String[] args){
        int[] nums = {0,1,0,1,1,0,1};
        int i = 0;
        int j = nums.length - 1;

        while(i<j){
            if(nums[i] == 1 && nums[j]  == 0){
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[i] == 0){
                i++;
            }
            if(nums[j] == 1){
                j--;
            }
        }
        for (int x : nums){
            System.out.print(x + "  ");
        }
    }
}