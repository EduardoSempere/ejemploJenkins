import java.util.HashSet;
import java.util.Set;

public class ArrayStr {
    

    public static void main(String[] args) {
       String[] ar = {"ertwer","yutgri","vft", "vft"};
       try {
        name(ar);
       }catch(RuntimeException r){
           System.out.println(r.getMessage());
           System.exit(0);
       }
       
    }
    

    public static void name(String[] a) throws RuntimeException  {

        Set<String> s = new HashSet<String>();
        char[] tmp;
        String r = "";
        for (int i = 0; i < a.length; i++) {
            tmp = a[i].toCharArray();
            
            for (int j =  tmp.length-1 ; j >= 0; j--) {
                if (tmp[j] == ';') {
                    throw new RuntimeException("fin");
                }
                r += tmp[j];
               
            }
            s.add(r);
            r="";
        }

        s.stream().forEach(System.out::println);
        
    }
}
