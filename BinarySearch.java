import java.util.Arrays;

public class BinarySearch {
    
    public static void main(String[] args){
        System.out.println(binarySearch(new int[]{5, 7, 12, 16, 36, 39, 42, 56, 71}, 52));
    } 

    public static boolean binarySearch(int[] arr, int target){

        int midIndex = Math.floorDiv(arr.length,2);
        int numMid = arr[midIndex];

        if (numMid == target) {
            return true;
        }else if (numMid > target && arr.length > 1){

            return binarySearch(Arrays.copyOfRange(arr,0,midIndex), target);
        }else if(numMid < target && arr.length >1){
             return binarySearch(Arrays.copyOfRange(arr, midIndex, arr.length), target);
        }else {
            return false;
        }
 
    }
}
