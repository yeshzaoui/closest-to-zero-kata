import java.util.Arrays;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class ClosestToZero {

    public int execute(int[] numbers) {
        if (numbers == null)
            throw new IllegalArgumentException();

        if (numbers.length > 0) {
            var result = Arrays.stream(numbers)
                    .filter(n -> n != 0)
                    .reduce(ClosestToZero::compare);

            return result.isPresent() ? result.getAsInt() : 0;
        }

        return 0;
    }

    private static int compare(int a, int b) {
        if (abs(a) < abs(b)) return a;
        if (abs(a) == abs(b)) return max(a, b);
        return b;
    }
}
