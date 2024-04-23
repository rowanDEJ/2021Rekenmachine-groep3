import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
    @Test
    void AddTest() {
        JavaFXApp app = new JavaFXApp();
        assertEquals(0, app.computeAdd(0, 0));
        assertEquals(1, app.computeAdd(4, -3));
        assertEquals(-8, app.computeAdd(-5, -3));
    }
}