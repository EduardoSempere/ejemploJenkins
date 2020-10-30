import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TowSum {
    
    public static void main(String[] args) {

        List<int[]> r = twoSum(new int[]{40,11,19,17,-12}, 28);
        r.forEach(x -> System.out.println(x[0] + " " + x[1]));
        
    }

    public static List<int[]> twoSum(int[] arr, int sum){

        List<int[]> result = new ArrayList<>();
        Vector<Integer> complemento = new Vector<>();

        for(int i = 0; i < arr.length; i++){
            int currenNum = arr[i];
            int contrParte = sum - currenNum;
            if (complemento.indexOf(contrParte) != -1) {
                result.add(new int[]{currenNum, contrParte});
            }
            complemento.add(currenNum);
        }

        return result;
    }
}
