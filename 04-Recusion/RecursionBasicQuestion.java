public class RecursionBasicQuestion{

    static void printMyName(int n){
        // base case 
        if(n==0){
            return;
        }
        // print my name
        System.out.println("Niraj kumar Yadav");

        // recusive 
        printMyName(n - 1);

    }

    static void numbersPrint(int n, int count){
        // base case 
        if(count > n){
            return ;
        }
        // processing 
        System.out.println(count);
        count++;

        // R R
        numbersPrint(n, count);

    }

    static void printNto1(int n){
        // base case 
        if(n==0){
            return;
        }

        System.out.println(n);
        // recusive 
        printNto1(n - 1);
    }


    static void printMyNumber(int arr[] , int i){
        // base case 
        if(i>arr.length){
            return;
        }
        // processing ---> 1 case bs solve karna hai
        System.out.println(arr[i]);

        // R.C
        printMyNumber(arr, i + 1); 
    }

    static void findMax(int arr[], int i, int maxi){

        // base case 
        if(i >= arr.length){
            System.out.println("max value ----> " + maxi);
            return;
        }

        // 1 case solve kro
        if(arr[i] > maxi){
            maxi = arr[i];
        }

        // R.C
        findMax(arr, i + 1, maxi);
    }



    static void findMin(int arr[], int i, int mini){

        // base case 
        if(i >= arr.length){
            System.out.println("mini value ----> " + mini);
            return;
        }

        // 1 case solve kro
        if(arr[i] < mini){
            mini = arr[i];
        }

        // R.C
        findMin(arr, i + 1, mini);
    }

  
    
    
    static int findTarget(int arr[], int i, int target) {

        // Base case
        if (i >= arr.length) {
            return -1;
        }

        // Processing
        if (arr[i] == target) {
            return i;
        }

        // Recursion
        int ans = findTarget(arr, i + 1, target);

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int i = 0;
        int target = 40;

        int ans = findTarget(arr, i, target);

        System.out.println("Found index : " + ans);
    }
}
