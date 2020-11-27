import java.util.Arrays;
import java.util.OptionalInt;

import javax.swing.text.Position.Bias;

public class BinaryGap {

    public static void main(String[] args) {
        // N is an integer within the range [1..2,147,483,647].
        System.out.println(solucion(529));
        System.out.println(solucion(15));
        System.out.println(solucion(20));
    }

    public static int solucion(int n) {

        String binary = Integer.toBinaryString(n);

        int ultimoUno = binary.lastIndexOf("1");
        String nuevoBinay = "";
        if (ultimoUno < binary.length()) {
            nuevoBinay = binary.substring(0, ultimoUno);
        }

        String[] ar = nuevoBinay.split("1");
        
        OptionalInt gap;
        
        gap = Arrays.stream(ar).mapToInt(x -> x.length()).max();
        if (gap.isPresent()) {
            return gap.getAsInt();
        }
        return 0;
        
    }
}
