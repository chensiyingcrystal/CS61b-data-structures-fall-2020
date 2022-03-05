import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

public class DogTest {
    @Test
    public void testSmall() {
        Dog d = new Dog(s:3);
        assertEquals("yip", d.noise());
    }
    
    @Test
    public void testLarge() {
        Dog d = new Dog(s:20);
        assertEquals("bark", d.noise());
    }
}
