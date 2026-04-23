import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @BeforeAll
    public static void setup() {
        System.out.println("Bat dau chay test");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Ket thuc chay test");
    }

    @Test
    public void testMax_AGreaterThanB() {
        assertEquals(10, MathUtils.max(10, 5));
    }

    @Test
    public void testMax_AEqualB() {
        assertEquals(7, MathUtils.max(7, 7));
    }

    @Test
    public void testMax_ALessThanB() {
        assertEquals(8, MathUtils.max(3, 8));
    }

    @Test
    public void testMax_BoundaryValues() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE));
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testDivide_PositiveB() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    public void testDivide_NegativeB() {
        assertEquals(-5, MathUtils.divide(10, -2));
    }

    @Test
    public void testDivide_ByZero_ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(10, 0);
        });
        assertEquals("Divider must not be zero", exception.getMessage());
    }
}
