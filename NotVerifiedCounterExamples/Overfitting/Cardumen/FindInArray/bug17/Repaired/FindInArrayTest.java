package Cardumen.FindInArray.bug17.Repaired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindInArrayTest {

	@Test
	void test() {
        int [] arr = {1};
        FindInArray fia = new FindInArray(arr);
        fia.setKey(1);

        assertFalse(fia.isMoreThanOneKey());
	}

}
