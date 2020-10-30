import java.util.stream.Stream;

public class ReverseArrayInPlace {
    
    public static void main(String[] args){
        String[] arr = "Eduardosem".split("");
        String[] res = reverseArrayInPlace(arr);
        Stream.of(res).forEach(System.out::print);
    }

    public static String[] reverseArrayInPlace(String[] arr){

        for(int i = 0; i < arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }


        return arr;
    }
}
