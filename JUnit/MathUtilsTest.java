package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), 
				"Divide should throw ArithmeticException when denominator is zero");		
	}
	
	@Test 
	void computeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area ");
		
	}

}
