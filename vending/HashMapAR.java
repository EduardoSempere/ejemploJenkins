package vending;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapAR {
    

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("1","a");
        map.put("1","b");
        map.put("1","c");
        map.put("1","d");
        map.put("2","");
        map.put("3","");
        map.put("4","");
        map.put("5","");
       // System.out.println(map);
         
        for (int i = 1; i <= map.size(); i++) {
           map.remove(i+"");

        }
       // System.out.println(map);

        Map<String, String> map1 = new HashMap<String, String>() {
            {
              put("test", "test123");
              put("test2", "test456");
            }
          };
       //   System.out.println(map1);
          for(Iterator<Map.Entry<String, String>> it = map1.entrySet().iterator(); it.hasNext(); ) {
              Map.Entry<String, String> entry = it.next();
              if(entry.getKey().equals("test")) {
                  it.remove();
              }
          }
       //   System.out.println(map1);

          List<Integer> integers = new ArrayList( 3);

          integers.add(1);
          integers.add(2);
          integers.add(3);
        //   for (Integer integer : integers) {
        //       integers.remove(1);
        //   }
        //    System.out.println(integers);
        for (int i = 0; i < integers.size(); i++) {
            integers.remove(i);
        }

      //  System.out.println(integers);
    }
}