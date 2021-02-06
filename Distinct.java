import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Distinct {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = random.ints(10_000, 0, 100_000).toArray();
        long startTime = System.nanoTime();
        System.out.println(soluction(arr));
        long endTime = System.nanoTime();
        long duration = Math.floorDiv((endTime - startTime),1_000_000)  ;  //divide by 1000000 to get milliseconds.
        System.out.println(duration);
        long startTime2 = System.nanoTime();
        System.out.println(soluction2(arr));
        long endTime2 = System.nanoTime();
        long duration2 = Math.floorDiv((endTime2 - startTime2),1_000_000) ;  //divide by 1000000 to get milliseconds.
        System.out.println(duration2);
    }


    public static int soluction(int[] A) {

        long count = Arrays.stream(A).distinct().count();

       return  Integer.parseInt(String.valueOf(count));
        
    }

    public static int soluction2(int[] A) {

        Set<Integer> r = new HashSet<Integer>();
       for (int i : A) {
            r.add(i);
    
       }
       return  r.size();
        
    }
}