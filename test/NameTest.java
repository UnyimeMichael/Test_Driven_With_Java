import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameTest {
    Name name = new Name();
    @Test
    public void nameTest() {
        name.setName("Godfrey");
        name.getName();
        assertEquals("Godfrey", name.getName());
    }
}
