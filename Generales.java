import java.util.HashMap;
import java.util.Map;

public class Generales {

    public static void main(String[] args) {

        // long x = 5;
        // long y = (x = 3);
        // System.out.println(x); // Outputs 3
        // System.out.println(y);

        // int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
        // OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
        // INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
        // System.out.print(mySimpleArray[i] + "\t");
        // }
        // System.out.println();
        // }

        // FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
        // for (char x = 'a'; x <= 'c'; x++) {
        // if (a == 2 || x == 'b')
        // continue FIRST_CHAR_LOOP;
        // System.out.print(" " + a + x);
        // }
        // }

        // byte x = 5;
        // byte y = 10;
        // double z = x + y;
        // System.out.println(z);

        // int x = 0;

        // while (x++ < 10) {
        // System.out.println(x);
        // }

        // String message = x > 10 ? "Greater than" : "false";

        // System.out.println(message + "," + x);

        // long x = 10;
        // long y = 2 * x;
        // System.out.println(y);

        // int x = 3;
        // int y = ++x * 5 / x-- + --x;
        // // 4 * 5 / 4 + 2;
        // System.out.println("x is " + x);
        // System.out.println("y is " + y);

        // java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        // list.add(10);
        // list.add(14);
        // for (int x : list) {

        //     System.out.print(x + ",");

        //     break;
        // }

        Map<String, String> f = new HashMap<>();
        f.put("arg0", "arg1");
        f.remove("arg0");
    }
}
