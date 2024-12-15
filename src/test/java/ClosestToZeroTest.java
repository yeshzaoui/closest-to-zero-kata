import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClosestToZeroTest {

    private ClosestToZero closestToZero;

    @BeforeEach
    void setUp() {
        closestToZero = new ClosestToZero();
    }

    @Test
    void should_throw_IllegalArgumentException_if_input_is_null() {
        assertThrows(IllegalArgumentException.class, () -> closestToZero.execute(null));
    }

    @Test
    void should_return_zero_when_there_is_no_element() {
        // Arrange
        int[] numbers = {};

        // Act
        int result = closestToZero.execute(numbers);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void should_return_10_when_there_is_1_element_equal_10() {
        // Arrange
        int[] numbers = {10};

        // Act
        int result = closestToZero.execute(numbers);

        // Assert
        assertEquals(10, result);
    }

    @Test
    void should_return_3_when_3_is_closest_element_to_zero() {
        // Arrange
        int[] numbers = {4, 8, 10, 14, 3, 5, 7};

        // Act
        int result = closestToZero.execute(numbers);

        // Assert
        assertEquals(3, result);
    }

    @Test
    void should_return_minus_1() {
        // Arrange
        int[] numbers = {19, 6, -1, 3, 17, 2, 9, -7};

        // Act
        int result = closestToZero.execute(numbers);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    void should_return_1() {
        // Arrange
        int[] numbers = {19, 6, -1, 3, 17, 2, 1, 9, -7};

        // Act
        int result = closestToZero.execute(numbers);

        // Assert
        assertEquals(1, result);
    }
}