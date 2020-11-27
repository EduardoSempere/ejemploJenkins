public class LambdaApp {
    
    public static void main(String[] args) {


        LambdaCalculate lCalculate = (x,y) -> x + y;

        LambdaCalculate lmulti = (x,y) -> x*y;

        System.out.println(lCalculate.calculate(4,5));
        System.out.println(lmulti.calculate(4,5));

        LambdaReversWord reverse = (str) -> {
            StringBuilder string = new StringBuilder(str);
            return string.reverse().toString();
        };

        System.out.println(reverse.reverse("sempere"));
        
    }
}
