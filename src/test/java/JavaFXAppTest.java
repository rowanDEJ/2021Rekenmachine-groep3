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
        assertEquals(5, app.computeDivide(10, 2));
        assertEquals(10, app.computeDivide(40, 4));
    }
}