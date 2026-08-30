public class factorialBasic{

    public long factorial(int num){
        // base case 
        if(num == 0){
            return 1;
        }

        // recusive case
        long ans = num * factorial(num - 1);
        return ans;
    }
    public static void main(String[] args) {
        factorialBasic fb = new factorialBasic();
        int num = 4;
        System.out.println("ans : " +fb.factorial(num));
         
    }
}