public class BinarySearch{


    //  mian logic of Binary search ------------------<> 
    public int binarySearching(int[] arr , int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end - start) / 2;  // remember this mid finding formula
                                              //  to avoid integer overflow
        while(start <= end){
            // compare target with midvalue
            if(arr[mid] == target){
                // target found 
                return mid;
            }
            else if(target > arr[mid]){
                // move right side 
                start = mid + 1;
            }
            else{
                // target < arrr[mid]
                end = mid - 1;
            }
            // update mid value    ----------<> dont forget 
            mid = start + (end - start) / 2;
        }
        // if target not found 
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10};
        int target = 8;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearching(arr, target));
    }
}