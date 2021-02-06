public class Transpose {
    
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3},{4,5,6}};
        solution(a);
    }

    public static int[][] solution(int[][] m) {

        int[][] re = new int[m[0].length][m.length];


        for (int i = 0; i < re[0].length; i++) {
            for (int j = 0; j < re.length; j++) {
                re[j][i] = m[i][j];
            }
        }


        return re;
        
    }
}
