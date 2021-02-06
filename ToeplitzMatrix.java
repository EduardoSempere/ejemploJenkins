public class ToeplitzMatrix {

    public static void main(String[] args) {

            int[][] a  = new int[2][2];
            a[0][0] = 1;
            a[0][1] = 2;
            a[1][0] = 2;
            a[1][1] = 1;
            System.out.println(solution(a));
    }

    public static boolean solution(int[][] matrix) {

        for (int r = 0; r < matrix.length; ++r)
            for (int c = 0; c < matrix[0].length; ++c)
                if (r > 0 && c > 0 && matrix[r - 1][c - 1] != matrix[r][c])
                    return false;
        return true;


    }
}
