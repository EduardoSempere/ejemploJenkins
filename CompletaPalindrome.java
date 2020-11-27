import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CompletaPalindrome {

    private static String collect;

    public static void main(String[] args) {
        System.out.println(completa("ACRDBCAR"));

    }

    public static String completa(String s) {

        int pointA = 0;
        int pointB = s.length() - 1;
        String[] arr = s.split("");

        Stack<String> derecha = new Stack<>();
        Queue<String> izq = new LinkedList<>();
        while (pointA <= pointB) {
            if (!arr[pointA].equals(arr[pointB])) {
                izq.add(arr[pointA]);
                derecha.push(arr[pointA]);
                pointA++;
            } else {
                izq.add(arr[pointA]);
                derecha.push(arr[pointB]);
                pointA++;
                pointB--;
            }

        }
        StringBuilder result = new StringBuilder();
        while (izq.poll() != null) {
            result.append(izq.peek());

        }
        System.out.println(result.toString());
        while (!derecha.empty()) {
            result.append(derecha.pop());
        }

        // izq.stream().forEach(System.out::print);
        // derecha.stream().forEach(System.out::print);
        return result.toString();

    }
}
