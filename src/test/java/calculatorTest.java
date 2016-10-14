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
	
}