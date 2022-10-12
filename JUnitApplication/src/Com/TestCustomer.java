package Com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unit.Calculator;

public class TestCustomer {
	@Test
	// check method
	public void runFindBiggest() {
		// assertequals check if first argument is equal to 2nd arg
		assertEquals(20, Calculator.findBiggest(10, 20, 15));
	}
}
