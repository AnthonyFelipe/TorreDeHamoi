import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TorreDeHanoiTest {
    @Test
    public void testMoverDiscos() {
        int movimentos = TorreDeHanoi.moverDiscos(3, 'A', 'C', 'B');
        assertEquals(7, movimentos);
    }
}
