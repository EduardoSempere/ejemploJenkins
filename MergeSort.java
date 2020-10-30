import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSort {
    
    public static void main(String[] args){
        Arrays.stream(mergeSort(new int[]{6000, 34, 203, 3, 746, 200, 984, 198, 764, 1, 9, 1})).forEach(System.out::println);
        System.out.println("===========================");
        Arrays.stream(mergeSort(new int[]{100,-20,40,30,16,-100,-101})).forEach(System.out::println);
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }
        int mindleIndex = Math.floorDiv(arr.length, 2);
        int[] firstHalf = Arrays.copyOfRange(arr, 0, mindleIndex);
        int[] lastHalf = Arrays.copyOfRange(arr, mindleIndex, arr.length);

        return merge(mergeSort(firstHalf), mergeSort(lastHalf));
    }

    public static int[] merge(int[] arr1, int[] arr2){

        List<Integer> resultado = new ArrayList<>(); 
        List<Integer> larr1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());  
        List<Integer> larr2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
       
        while (larr1.size() > 0 && larr2.size() > 0) {
            int minValor;
            if (larr1.get(0) < larr2.get(0)) {
                minValor = larr1.get(0);
                larr1.remove(0);
            }else {
                minValor = larr2.get(0);
                larr2.remove(0);
            }
            resultado.add(minValor);
        }
        if (larr1.size() > 0) {
            resultado.addAll(larr1);
        } else {
            resultado.addAll(larr2);
        }

        return resultado.stream().mapToInt(x -> x).toArray(); 
    }
}
