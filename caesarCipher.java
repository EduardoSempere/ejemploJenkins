public class caesarCipher {
    
    public static void main(String[] args) {
       System.out.println(caesarCipher("Zoo Keeper", 2));
       System.out.println(caesarCipher("Big car", -16));
       System.out.println(caesarCipher("Javascript", -900));
    }

    public static String caesarCipher(String str, int num){
        num = num % 26;
        String[] strArr = str.split("");
        String[] strlower = str.toLowerCase().split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        
        for(int i = 0; i < strlower.length;i++){
            String currenCharacter= strlower[i];
            if (currenCharacter.equals(" ")) {
                result += currenCharacter;
                continue;                
            }
            int currentIndex = alphabet.indexOf(strlower[i]);
            int newIndex = currentIndex  + num;
            if (newIndex > 25) {
                newIndex = newIndex - 26;
            }
            if (newIndex < 0) {
                newIndex = 26 + newIndex; 
            }
            if (strArr[i].equals(strArr[i].toUpperCase())) {
                result += (alphabet.charAt(newIndex) + "").toUpperCase();
            }else {
                result += alphabet.charAt(newIndex)+"";
            }

        }

        return result;
    }
}
