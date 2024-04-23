import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void testComputeDivide(){
        IComputation comp = new DivideComputation();
        assertEquals(2, comp.compute(4, 2));
        assertEquals(4, comp.compute(8, 2));
        assertEquals(3, comp.compute(9, 3));
    }
    @Test
    void testComputeAdd() {
        IComputation comp = new PlusComputation();
        assertEquals(0, comp.compute(0, 0));
        assertEquals(1, comp.compute(4, -3));
        assertEquals(-8, comp.compute(-5, -3));
    }
    @Test
    void testComputeMultiply() {
        IComputation comp = new MultiplyComputation();
        assertEquals(2, comp.compute(4, 2));
        assertEquals(4, comp.compute(8, 2));
        assertEquals(3, comp.compute(9, 3));
    }
}