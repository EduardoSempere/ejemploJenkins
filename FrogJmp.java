public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10, 10, 30));
        System.out.println(solution(10, 55, 30));
        System.out.println(solution(10, 85, 30));
        System.out.println(solution(15, 115, 30));
    }

    public static int solution(int X, int Y, int D) {
        int distaciaRestante = Y - X;

        int saltos = 0;
        if (distaciaRestante != 0) {

            if (distaciaRestante < D) {
                saltos++;
            } else {
                saltos = distaciaRestante / D;
                if (distaciaRestante % D > 0) {
                    saltos++;
                }
            }
        }

        return saltos;
    }
}
