import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IsPalidrome {
    

    public static void main(String[] args) {
        System.out.println(esPalidrome("aaddaa"));
        // System.out.println(palindrome("bdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbababdbaba"));
    }

    public static int palindrome(String s) {
        // Write your code here
        int result = 0;
        String word = "";
        Set<String> cache = new HashSet();
        for(int i = -1; i < s.length()-1;i++){
            for(int j = i+1; j < s.length(); j++){
                word +=String.valueOf(s.charAt(j));
                if(isPalidrome(word)){
                    cache.add(word);
                    

                }
            }
            word = "";
        }
        return cache.size();
    
    }

    public static boolean isPalidrome(String palabra){
        palabra = palabra.toLowerCase();
        String[] palabraArray = palabra.split("");
        String validCharacters = "abcdefghijklmnopqrstuvwyxz";

        List<String> pal = Stream.of(palabraArray).filter(carac -> validCharacters.indexOf(carac) != -1)
                                                .collect(Collectors.toList());
        List<String> palre = Stream.of(palabraArray).filter(carac -> validCharacters.indexOf(carac) != -1)
                                                .collect(Collectors.toList());
        Collections.reverse(palre);
               
        return pal.equals(palre);
    }

    public static boolean esPalidrome(String s){

        String validCharacters = "abcdefghijklmnopqrstuvwyxz";

        int pointA = 0;
        int pointB = s.length()-1;
        String[] arr = s.split("");
        boolean result = true;
        while (pointA <= pointB) {
            if ((validCharacters.indexOf(arr[pointA]) != -1 ) && (validCharacters.indexOf(arr[pointB]) != -1)) {
             if (!arr[pointA].equals(arr[pointB])) {
                 result = false;
                 break;
             }
            }else {
                result = false;
                break;
            }
             pointA++;
             pointB--;
        }
        return result;
    }
}
