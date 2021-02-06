public class SopaLetra {

    public static void main(String[] args) {

    }

    public static void solution(String[][] A, String input) {

        char[] ch = input.toCharArray();
        int xPrimeraLetra = 0;
        int yPrimeraLetra = 0;
        boolean primeraLetraEncontrada = false;

        // buscar primera letra
        String c = ch[0] + "";
        boolean result = false;
        for (int x = 0; x < A[x].length; x++) {
            for (int y = 0; y < A.length; y++) {
                if (A[x][y].equals(c)) {
                    xPrimeraLetra = x;
                    yPrimeraLetra = y;
                    primeraLetraEncontrada = true;
                    break;
                }

            }
        }

        // si primera letra fue encontrada busca a partir de esa posicion las siguietes
        // letras
        //
        if (primeraLetraEncontrada) {
            int xTemp = xPrimeraLetra;
            int yTemp = yPrimeraLetra;
            boolean adyacenteEncontrada = false;

            for (int i = 1; i < ch.length; i++) {
                String b = ch[i] + "";
                // arriba
                if (yTemp != 0) {
                    if (A[xTemp][yTemp - 1] == b) {
                        adyacenteEncontrada = true;
                        continue;
                    }

                }
                // abajo
                if (yTemp != 0) {
                    if (A[xTemp][yTemp - 1] == b) {
                        adyacenteEncontrada = true;
                        continue;
                    }

                }
                // derecha
                if (yTemp != 0) {
                    if (A[xTemp][yTemp - 1] == b) {
                        adyacenteEncontrada = true;
                        continue;
                    }

                }
                // izq
                if (yTemp != 0) {
                    if (A[xTemp][yTemp - 1] == b) {
                        adyacenteEncontrada = true;
                        continue;
                    }

                }

            }
        }

    }
}