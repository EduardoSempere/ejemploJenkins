import java.util.stream.Stream;

public class Sum {

    public static void main(String args[]) {

        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Output: Because nums[0] + nums[1] == 9, we return [0, 1].

        // int[] r = sum(new int[]{2,7,11,15}, 9);
        // Stream.of(r).forEach(x -> System.out.println(r[0] +" , " + r[1] ));

        // Input: nums = [3,2,4], target = 6
        // Output: [1,2]
        // int[] r = sum(new int[] { 3,2,4 }, 6);
        // Stream.of(r).forEach(x -> System.out.println(r[0] + " , " + r[1]));

        // Input: nums = [3,3], target = 6
        // Output: [0,1]

        int[] r = sum(new int[] { 3, 2, 3 }, 6);
        Stream.of(r).forEach(x -> System.out.println(r[0] + " , " + r[1]));

    }

    public static int[] sum(int[] arr, int target) {

        int[] r = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int suma = arr[i] + arr[j];
                if (suma == target) {
                    r[0] = i;
                    r[1] = j;
                    break;
                }
            }
        }
        return r;
    }
}
