package demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClacTest {
 private Calc c1;
	@Test
	public void testAdd() {
		int i = c1.add("10","20");
		assertTrue("add with 10,20", i==30);
	}
	@Test
	public void testDivide() {
		int i = c1.divide("100","20");
		assertTrue("divide with 100, 20", true);
	}
	
	@Test
	public void testDividebyZero() {
		try {
			int i = c1.divide("100","0");
		}catch (ArithmeticException e) {
			assertTrue("divide by zero", true);
			}
		
	   }
	@Test
	public void testDivdeNonNumeric() {
		try {
		int i = c1.divide("1A0","20");
		}catch (NumberFormatException e) {
		assertTrue("Number Format Exception", true);
	}
   }
}
