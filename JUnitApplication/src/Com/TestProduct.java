package Com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unit.Calculator;

public class TestProduct {
	@Test
	// check method
	public void runFindMax() {
		
		int[] myArray= {100,20,30,1500,400};
		// assertequals check if first argument is equal to 2nd arg
		assertEquals(400, Calculator.findMax(myArray));
	}
}
