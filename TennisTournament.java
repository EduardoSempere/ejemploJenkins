public class TennisTournament {
    
    public static void main(String[] args) {
        
    }

    public static int solution(int P, int C) {
        if (P <= 1) {
            return 0;
        }
        if (C < 0) {
            return 0;
        }
        int pp = P/2;
        if (pp >= C) {
            return C;
        }else {
            return pp;
        }
    }
}
