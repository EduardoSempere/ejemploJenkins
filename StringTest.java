public class StringTest {
    
    public static void main(String[] arg)  {
        System.out.println(solution("abcabcbb"));
    }

    public static int solution(String str) {

        String result = "";
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i ++){
          if(result.indexOf(ch[i]) < 0){
            result = result + ch[i];
          }
        }
    
        return result.length();
    }
    
}

