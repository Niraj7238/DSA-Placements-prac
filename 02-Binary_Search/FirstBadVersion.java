public class FirstBadVersion{

    // suppose version 4 is the first bad version
    static int badVersion = 4;

    // API simulator 
    static boolean isBadVersion(int version){
        return version >= badVersion;
    }

    public static int firstBadVersion(int n){

        int low = 1;
        int high = n;

        while(low < high){
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)){
                high = mid;  // mid is bad
            }
            else{
                low = mid + 1;    // mid is good 
            }
        }
        return low;
    }




    public static void main(String[] args) {
        int n = 5;
        int ans = firstBadVersion(n);
        System.out.println("first bad version " + ans);
        
    }
}