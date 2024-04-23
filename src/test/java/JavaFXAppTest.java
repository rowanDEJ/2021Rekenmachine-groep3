import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void testComputeDivide() {
        JavaFXApp app = new JavaFXApp();
        assertEquals(2, app.computeDivide(4, 2));
        assertEquals(4, app.computeDivide(8, 2));
        assertEquals(3, app.computeDivide(9, 3));
    }
}