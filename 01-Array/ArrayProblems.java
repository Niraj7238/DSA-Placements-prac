public class ArrayProblems {

    // Method to calculate average of array
    static double getAvg(int[] arr) {

        // Store total sum
        double sum = 0;

        // Visit every element of array
        for (int i : arr) {

            // Add current element to sum
            sum += i;
        }

        // Number of elements
        int size = arr.length;

        // Calculate average
        double avg = sum / size;

        // Return average
        return avg;
    }






    // Multiply each element of array by 10
    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i = 0; i<size;i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
            
        }
        // return updated arr
        return newArray;
    }






    // Search an element in array {linear Search}
    // linear search
    static boolean findTarget(int arr[] , int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }

        //  if target is not persent in array
        return false;
    }    

    // to finding maximum number 
    static int getMax(int arr[]){
        int maxi = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        // maxi ke andar sabse badi value aa chuki hogi
        return maxi;
    }







    // print sum of positive and negative array sum
    static int[] getPosNegSum(int arr[]){
        int posSum = 0;
        int negSum = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                // number is positive 
                posSum = posSum + arr[i];
            }
            else{
                // num is negative 
                negSum = negSum + arr[i];
            }
        }
        int ans[] = {posSum , negSum};
        return ans;
    }








    static int[] getZeroOne(int arr[]){
        int zeroCount = 0;
        int oneCount = 0;

        for(int i=0; i<arr.length; i++){
            // arr[i] = 0
            if(arr[i] == 0){
                zeroCount++;
            }
            else{
                // arr[i] = 1
                oneCount++;
            }
        }
        int ans[] = {zeroCount , oneCount};
        return ans;
    }









    // unsorted array in sorted arrry , print the element
    static int getUnsortedElement(int arr[]){

        for(int i=0; i<arr.length; i++){
            if(arr[i+1] < arr[i]){
                return arr[i + 1];
            }
        }
        return -1;
    }







    static void swapAlternate(int[] arr){
        // i ko 0 se start karenge 
        // har bar 2 step aage badhayege
        for(int i = 0; i < arr.length-1; i+=2){

            // swap arr[i] and arr[i + 1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i+ 1] = temp;
        }
    }






    // Arrray Intersectionn
    static void intersectionArr(int[] arr1, int[] arr2){

        // first array  ke har element ko check kro
        for(int i = 0; i<arr1.length; i++){

            // second array me search kro 
            for(int j=0; j<arr2.length; j++){

                if(arr1[i] == arr2[j]){
                    
                    System.out.print(arr1[i] +"   ");
                    // same element ko dobara print hone se roke
                    break;

                }
            }
            
        }
    }






    // print alternate extreme element 
    static void printExtreme(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            // smallest element 
            System.out.print(arr[left] + "  ");

            // largest element 
            if(left != right){
                System.out.print(arr[right] + "  ");
            }

            // move towards center 
            left++;
            right--;
        }
    } 



    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7,8};
        // printExtreme(arr);



        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {3, 4, 5, 6, 7};

        // intersectionArr(arr1, arr2);




        // int[] arr = {1,2,3,4,5,6};
        // swapAlternate(arr);

        // for(int i : arr){
        //     System.out.print(i + "  ");
        // }



        // int arr[] = {1,2,5,4,9};
        // System.out.println(getUnsortedElement(arr));






        // int arr[] = {1,0,1,1,1,0,0,1,1};
        // int ans[] = getZeroOne(arr);
        // System.out.println("ZeroCount = " + ans[0]);
        // System.out.println("OneCount = " + ans[1]);






        // int arr[] = {2,-3,-5,-7,9};
        // int ans[] = getPosNegSum(arr);
        // System.out.println("Positive sum = " + ans[0]);
        // System.out.println("Negative sum = " + ans[1]);




        // int arr[] = {1,2,3,5,7,9};
        // System.out.println(getMax(arr));



        // boolean ans = findTarget(arr, 9);
        // System.out.println(ans);





        // int arr[] = {1,2,3,4,5};
        // int ans[] = multiplyBy10(arr);
        // System.out.println("printing ans array : ");
        // for(int i:ans){
        //     System.out.println(i);
        // }


        // // Create array
        // int[] arr = {2, 4, 1, 3};

        // // Call method and print result
        // System.out.println(getAvg(arr));
        
    }
}