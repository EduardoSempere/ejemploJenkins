public class Dicc {
    

    // Input: s = “sandbag”, wordDict = [“sand”, “bag”]
    public static void main(String[] args) {
        String input = "sandbag";
        String[] wordDic = {"sand", "bag"};
        System.out.println(solution(input, wordDic));
//         Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
// Output: false 
        String input2 = "sempcatsdogcatsdogcatsdog";
        String[] wordDic2 = {"cats", "dog", "sand", "and", "cat"};
        System.out.println(solution(input2, wordDic2));
    }

    public static boolean solution(String input, String[] wordDic) {
        
        boolean result = true;
        if (input.isEmpty()) {
            return false;
        }
        String tmp1 = "";
        String tmp2 = "";
        for (int i = 0; i < wordDic.length; i++) {
            if (input.indexOf(wordDic[i]) == -1) {
                result = false;
                break;
            }else {
                tmp1 = input.substring(0, input.indexOf(wordDic[i]));

                tmp2 = input.substring(input.lastIndexOf(wordDic[i]), input.length());

                input = tmp1 + tmp2;
            }

        }

        return result;
    }
}

