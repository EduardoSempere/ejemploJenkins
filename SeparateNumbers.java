import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateNumbers {
    
    public static void main(String[] args) {

        System.out.println(separate(new int[]{5, 3, -3, -4, 0, 2, -1, 4, -7, 2}));
    }

    // Create a function that takes integer array as input and returns integer
    //  array. Inside the function it requires to rearrange the array elements
    //   in such a way that all the positives and zeros are moves to left and 
    //   negatives are moved to right. This is NOT sorting. Maintain the order 
    //   of positives and negatives in the same order it is given. 

    // For example:
    // Input:  [5, 3, -3, -4, 0, 2, -1, 4, -7, 2]
    // Output: [5, 3, 0, 2, 4, 2, -3, -4, -1, -7]

    public static String separate(int[] arr) {
        
        List<Integer> lPosit = new ArrayList<>();
        List<Integer> lNegative = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                lPosit.add(arr[i]);
            } else {
                lNegative.add(arr[i]);
            }
        }
        lPosit.addAll(lNegative);
        return lPosit.stream().map(String::valueOf).collect(Collectors.joining(",","[","]"));
         
    }
}
