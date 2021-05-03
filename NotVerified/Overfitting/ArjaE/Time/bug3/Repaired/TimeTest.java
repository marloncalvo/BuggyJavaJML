
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTest {
    @Test
    void test() {
        Time time = new Time();
        
            time.setSecond(25);
                assertEquals(25, time.getSecond());
    }

    @Test
    void test1() {
        Time time = new Time();
        
            time.setSecond(20);
                assertEquals(20, time.getSecond());
    }
    
    @Test
    void test2() {
        Time time = new Time();
        
            time.setSecond(31);
                assertEquals(31, time.getSecond());
    }
    
    @Test
    void test3() {
        fail("Cannot test timer()");
    }
}
