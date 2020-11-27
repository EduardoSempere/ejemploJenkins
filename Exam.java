public class Exam {

    public static void main(String[] args) {
        System.out.println(solution(2,3, new int[]{2,3}));
    }

    public static String solution(int U, int L, int[] C) {

        // int[] arrayU = new int[C.length];
        // int[] arrayL = new int[C.length];

        if (C.length == 0) {
            return "IMPOSSIBLE";
        }

        StringBuilder strU = new StringBuilder();
        StringBuilder strL = new StringBuilder();
        boolean impossible = false;
        for (int i = 0; i < C.length; i++) {
            if(0 > C[i] || C[i] > 2 ){
                return "IMPOSSIBLE";
            }
            if (C[i] == 2) {
                if (U > 0) {
                    U--;
                    strU.append("1");
                } else {
                    impossible = true;
                    break;
                }
                if (L > 0) {
                    L--;
                    strL.append("1");
                } else {
                    impossible = true;
                    break;
                }
            }
            if (C[i] == 0) {
                strL.append("0");
                strU.append("0");
            }
            if (C[i] == 1) {
                if (U > 0) {
                    U--;
                    strU.append("1");
                    strL.append("0");
                } else {
                    if (L > 0) {
                        L--;
                        strL.append("1");
                        strU.append("0");
                    } else {
                        impossible = true;
                        break;
                    }
                }
            }
        }

        if (impossible) {
             return "IMPOSSIBLE";
        }

        return strU.append(",").append(strL.toString()).toString();

    }
}
