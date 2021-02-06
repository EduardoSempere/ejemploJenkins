import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        // List<String> l = new ArrayList<>();
        // l.add(" ");
        // l.add(" ");
        // l.add(" ");
        // l.add(" ");
        // l.add(" ");
        // l.add(" ");
        // l.add(" ");
        // l.add(" ");
        // l.add(" ");
        // l.add(" ");
        // System.out.println(sol(l));
        System.out.println(sol("ABCD", "CDAB"));
        System.out.println(sol("table", "eblta"));
        System.out.println(sol("table", "bleta"));
        System.out.println(sol("sempere", "peretem"));
    }

    public static String sol(List<String> list) {

        if (list.size() < 3)
            return (0 + "");

        if ((list.size() % 2) == 0) {
            int m = list.size() / 2;
            return "midle par " + m + " and " + (m + 1);
        } else {
            int m = list.size() / 2;
            return "midle is " + (m + 1);
        }

    }

    public static boolean sol(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        char[] ar = a.toCharArray();
        char[] br = b.toCharArray();

        int j = 1;
        boolean result = true;
        int indexPL = b.indexOf(ar[0]) + 1;

        while (j < ar.length - 1) {
            if (indexPL == br.length) {
                indexPL = 0;
            }
            if (ar[j] != br[indexPL]) {
                result = false;
            }
            j++;
            indexPL++;

        }

        return result;

    }
}
