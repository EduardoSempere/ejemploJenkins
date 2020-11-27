public class Fibonacci {

    public static void main(String[] args) {

        fibonacci(13);
    }

    public static void fibonacci(int n) {

        int p1 = 0;
        int p2 = 1;
        int p3 = 0;
        String str = "";
        if (n < 0) {
            //error
        }
        if (n == 0) {
            System.out.println(p1);
        }  else {
            str = p1 +", "+p2;
            for (int i = 1; i <= n; i++) {
                p3 = p1 + p2;
                
                if (p3 <= n ) {
                    str += ", " + p3;
                    p1 = p2;
                    p2 = p3;
                }else {
                    break;
                }
            }
        }
        System.out.println(str);

    }
}
