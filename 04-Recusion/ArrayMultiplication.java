public class ArrayMultiplication {

    // Function to calculate multiplication
    static int multiply(int[] arr, int index) {

        // Base case
        // Jab saare elements process ho jaayein
        if (index == arr.length) {
            return 1;
        }

        // Recursive case
        return arr[index] * multiply(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5};

        // Start recursion from index 0
        int ans = multiply(arr, 0);

        System.out.println("Multiplication = " + ans);
    }
}