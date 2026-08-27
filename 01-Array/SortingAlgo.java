public class SortingAlgo{


    // Bubble Sorting -------<>

    static void bubbleSort(int arr[]){  // tc ---> O(n^2)
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }


    // Selection Sorting ----------<>

    static void selectionSort(int arr[]){  // tc ---> O(n^2)
        
        // outer loop
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;

            // inner loop --> comparsion arr[j] and arr[minIndex]
            for (int j = i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // swapping 
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    // Insertion Sort ----------<>
    static void insertionSort(int arr[]){  // tc----> O(n^2)
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = i;
            int prev = i-1;

            int currValue = arr[i];

            while(prev >= 0 && currValue < arr[prev]){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }

    }





    public static void main(String[] args) {
        int arr[] = {6, 5, 1, 3, 2};
        insertionSort(arr);

        System.out.println("Priting the array : ");
        for(int value: arr){
            System.out.print( value + "  ");
        }

    }
}