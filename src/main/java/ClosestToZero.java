import java.util.Arrays;
import java.util.OptionalInt;

public class ClosestToZero {

    public int execute(int[] numbers) {
        if (numbers == null)
            throw new IllegalArgumentException();

        if (numbers.length > 0) {
            OptionalInt result = Arrays.stream(numbers).filter(n -> n != 0)
                    .reduce((a, b) -> Math.abs(a) < Math.abs(b) ? a : (Math.abs(a) == Math.abs(b) ? Math.max(a, b) : b));

            return result.isPresent() ? result.getAsInt() : 0;
        }

        return 0;
    }
}
