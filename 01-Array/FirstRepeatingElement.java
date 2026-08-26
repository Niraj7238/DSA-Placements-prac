
import java.util.HashMap;

public class FirstRepeatingElement{
    public static int findFirstRepeatingElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        // count frequency of every element
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        }
        
        // find first element whose frequency
        for(int num : arr){
            if(freq.get(num) > 1){
                return num;
            }
        }
        return  -1;


    }

    
    public static void main(String[] args) {
        int[] arr = {10,5,3,4,3,5,6};
        System.err.println(findFirstRepeatingElement(arr));
        
    }
}