public class lowerBound {

    static int getLowerBound(int arr[], int target) {

        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] >= target) {

                // possible answer
                ans = mid;

                // search for smaller index on left
                e = mid - 1;

            } else {

                // target can be on right
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 30, 30, 30, 30, 40, 50};
        int target = 35;

        int ans = getLowerBound(arr, target);

        System.out.println("ans : " + ans);
    }
}