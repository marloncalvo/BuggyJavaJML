
import static org.junit.Assert.*;
import org.junit.Test;
public class StackQueueTest {
	void repeat(Runnable r, int times) {
		for (int i = 0; i < times; i++) {
			r.run();
		}
	}

	/*
	 * Cannot insert to queue without illegal arg exception
	 */
	@Test
	void test0() {
		fail("The function queue_isFull() is not testable for this case");
	}

}
