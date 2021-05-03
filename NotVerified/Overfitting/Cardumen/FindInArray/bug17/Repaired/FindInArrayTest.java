
import static org.junit.Assert.*;
import org.junit.Test;
public class FindInArrayTest {
	@Test
	void test() {
        int [] arr = {1};
        FindInArray fia = new FindInArray(arr);
        fia.setKey(1);

        assertFalse(fia.isMoreThanOneKey());
	}

}
