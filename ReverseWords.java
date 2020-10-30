public class ReverseWords {
    
    public static void main(String[] args) {
        System.out.println(reverseWords("Coding JavaScript"));
    }

    public static String reverseWords(String str) {

        String[] text = str.split(" ");
        String resultado = "";

        for(int i = 0; i < text.length; i++){
            String[] palabra = text[i].split("");
            for(int y = palabra.length-1; y >= 0; y--){
                resultado += palabra[y];
            }
            resultado += " "; 
        }

        return resultado;
    }

}
