import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 

public class HarmlessRansom {

    public static void main(String args[]){

      //  boolean a = harmlessRan("this is a secret note for you from a secret admirer", "puerto rico is a place of great wonder and excitement it has many secret waterfall locatoins that i am an admirer of you must hike quite a distance to find the secret places as they are far from populated areas but it is worth the effort a tip i have for you is to go early in the morning when it is not so hot out also note that you must wear hiking boots this is one of the best places i have ever visited");
      boolean a = harmlessRan("Sempere uno uno uno dos hijas",
                             "Era una ves Sempere uno uno uno dos hijas");
       System.out.println(a);
    }

    public static boolean harmlessRan(String note, String magazine){

        String[] notesArray = note.split(" ");
        String[] magazineArray = magazine.split(" ");
       
      
        // Map<String, Long> noteFrec =  
        // Stream.of(notesArray).collect(Collectors
        // .groupingBy(String::toString,Collectors.counting()));
        Map<String, Integer> noteFrec = Stream.of(notesArray)
                                           .collect(
                                               Collectors.groupingBy(String::valueOf,
                                                                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));


        Map<String, Long> magFrec = Stream.of(magazineArray)
                                          .collect(Collectors.groupingBy(String::valueOf, Collectors.counting())); 

       
        return noteFrec.entrySet().stream()
                       .allMatch(e -> e.getValue().equals(magFrec.get(e.getKey())));

   
    } 
}