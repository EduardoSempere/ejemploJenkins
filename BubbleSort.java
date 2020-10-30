import java.util.stream.IntStream;

public class BubbleSort {
    
    public static void main(String[] args){

        IntStream.of(bubbleSort(new int[]{6000, 34, 203, 3, 746, 200, 984, 198, 764, 9, 1})).forEach(System.out::println);
        IntStream.of(bubbleSort(new int[]{5,3,8,2,1,4})).forEach(System.out::println);
    }

    public static int[] bubbleSort(int[] arr){

        for(int i = arr.length; i > 0 ; i--){
            for(int j = 0; j < i-1 ; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
