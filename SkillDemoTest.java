import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplication() {
        assertEquals(6, SkillDemo.multiply(2, 2)); //this test will fail
    }
}
