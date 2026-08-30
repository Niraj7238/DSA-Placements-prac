public class PowerOfTwo{

    static int powerOfTwo(int n){
        // base case
        if(n == 0){
            return 1;
        }

        // recusive case 
        int ans = 2 * powerOfTwo(n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(powerOfTwo(5));
        
    }
}