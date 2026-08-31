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


    public static void main(String[] args) {

        // Create array
        int[] arr = {2, 4, 1, 3};

        // Call method and print result
        System.out.println(getAvg(arr));
    }
}