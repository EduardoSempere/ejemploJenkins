public class Test {
    
    public static void main(String[] args) {
        sol();
    }

    public static void sol() {
        
         String str = "ABC";

        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();

        System.out.println(str);
        

    }
}
