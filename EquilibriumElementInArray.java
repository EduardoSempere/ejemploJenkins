public class EquilibriumElementInArray {
     
    public static void main(String[] args) {
        solution(new int[]{-7,1,5,2,-4,3,0});
    }

    public static void solution(int[] A) {

        int sum = 0;
        int rs = 0;
        int ls = 0;

        for (int i : A) {
            sum += i;
        }
        for (int i : A) {
            rs = rs - i;
            if (ls == rs) {
                System.out.println(i);
                break;
            }
            ls = ls + i;
        }

          
        
    }
}
