import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    

    public static void main(String[] args){
        System.out.println(Math.sqrt(200));

        sieveOfEratosthenes(200).stream().forEach(System.out::println);
    }

    public static List<Integer> sieveOfEratosthenes(int num){
        boolean[] primos = new boolean[num];
        for(int i = 0; i < primos.length; i++){
            primos[i] = true;
        }

        primos[0] = false;
        primos[1]= false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            for(int j = 2; i * j < num; j++){
                primos[i*j] = false;
            }
        }
        List<Integer> resultado = new ArrayList<>();
        for(int i =  0; i < primos.length; i++){
            if (primos[i]) {
                resultado.add(i);
            }
        }
        return resultado;
    }
}
