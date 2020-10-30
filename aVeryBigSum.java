import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class aVeryBigSum {
    
    static long aVeryBigSum(long[] ar) {

        return LongStream.of(ar).sum();

    }
}
