
import java.util.HashMap;

public class ArrayManipulationProblem{


    // reverse the array 

    static void reverseArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (i <= j){
            // swap 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // i ko aage badhao 
            i++;
            // j ko piche lo
            j--;
        }
        // print 
        for(int k : arr){
            System.out.println(k);
        }
    }





    // shift array element by 1 position
     static void shiftBy1(int[] arr){
        // step1: store last value in temp
        int n = arr.length;
        int temp = arr[n-1];

        //step2: shift all value of array
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        // step3 : temp ki value ko 0 index pr copy kro
        arr[0] = temp;
     }


     // print alternate element of an array
     static void printAlternate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i <= j) { 
            if(i == j){
                System.out.println(arr[i]);
                return;
            }
            else{
                // i < j
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
     }


     


     // mode finding using hashmap'
     static void getMode(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int i: freq.keySet()){
            // i --> will represent key
            System.out.println(i + " --> " + freq.get(i));
        }
     }




    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,5,5,5,5,5};
        getMode(arr);





    //     shiftBy1(arr);

    //     for(int a: arr){
    //         System.out.print(a + "  ");
    //     }
    //     System.out.println();
        
    }
}