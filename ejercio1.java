import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ejercio1 {
    

    public static void main(String[]args) {
        System.out.println(countPairs(Arrays.asList(1,2,5,6,9,10), 2));
    }

    public static int countPairs(List<Integer> numbers, int k) {
        // Write your code here
        

        List<Integer> res = new ArrayList<>();
           
        int resultado = 0;
        for(int i = 0; i < numbers.size();i++){
            int a = numbers.get(i);
            int b = a + k;
            if (numbers.indexOf(b) != -1) {
                int sum = a +b;
                numbers.remove(numbers.indexOf(b));
                if (res.indexOf(sum) == -1) {
                    resultado = resultado + 1;
                    res.add(sum);
                }
            }
           
        }

        return resultado;
            
    
        }
}
