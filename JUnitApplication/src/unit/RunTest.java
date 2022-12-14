package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	@Test
	// check method
	public void runFindBiggest() {
		// assertequals check if first argument is equal to 2nd arg
		assertEquals(20, Calculator.findBiggest(10, 20, 15));
	}

	@Test
	// check method
	public void runFindBiggest1() {
		// assertequals check if first argument is equal to 2nd arg
		assertEquals(200, BiggestFromArray.findBiggest1());
	}

	@Test
	// check method
	public void runFindMax() {
		
		int[] myArray= {100,20,30,1500,400};
		// assertequals check if first argument is equal to 2nd arg
		assertEquals(1500, Calculator.findMax(myArray));
	}

}
