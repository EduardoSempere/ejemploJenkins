import java.util.TreeMap;

public class Exceptions {

    public static void main(String[] args)  {

         
            TreeMap<String,String> names =new TreeMap<String,String>( );
            names.put("key1","cherry");
            names.put("key2","banana");
            names.put("key3","apple");
            names.put("key4","kiwi");
            names.put("key2","orange");
            System.out.println(names);
        // try {
        //     int x = 0;
        //     int y = 5 / x;
        // }  catch (Exception e){
        //     System.out.println("Exception");
        // }  
        // System.out.println("finished");

    //     try 
    //     {
    //         badMethod();  
    //         System.out.print("A"); 
    //     }  
    //     catch (Exception ex) 
    //     {
    //         System.out.print("B");  
    //     } 
    //     finally 
    //     {
    //         System.out.print("C"); 
    //     } 
    //     System.out.print("D"); 
    // }  
    // public static void badMethod() 
    // {
    //     throw new Error(); /* Line 22 */
    // } 
    }
}
