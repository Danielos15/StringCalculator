package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, calculator.add(""));
	}
	
	@Test
	public void testSingleNumber() {
		assertEquals(1, calculator.add("1"));
	}
	
	@Test
	public void testTwoNumbers() {
		assertEquals(3, calculator.add("1,2"));
	}
	
	@Test
	public void testMultipleNumbersOne() {
		assertEquals(8, calculator.add("5,2,1"));
	}
	
	@Test
	public void testMultipleNumbersTwo() {
		assertEquals(5, calculator.add("1,1,2,1"));
	}
	
	@Test
	public void testMultipleNumbersThree() {
		assertEquals(12, calculator.add("6,2,1,2,1"));
	}
	
	@Test
	public void testHandleNewLineOne() {
		assertEquals(12, calculator.add("6,2\n1,2,1"));
	}
	
	@Test
	public void testHandleNewLineTwo() {
		assertEquals(12, calculator.add("6,2,1,2\n1"));
	}
	
	@Test
	public void testNegativeNumbers() {
		String error = "";
		try {
			calculator.add("6,2,-1,2,1");
		}
		catch (Exception x) {
			error = x.getMessage();
		}
		assertEquals("Negatives not allowed: -1", error);
	}
	
}