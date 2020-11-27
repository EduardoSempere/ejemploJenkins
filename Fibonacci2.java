public class Fibonacci2 {
    
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    public static int fibo(int n){
        int p1 = 0;
        int p2 = 1;
        int p3 = 0;
        for (int i = 1; i < n; i++) {
           
            p3 = p2 +p1;
            p1=p2;
            p2=p3;
        }

        return p3;
    }
}
