package sonar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	Calculator c = new Calculator();
	@Test
	public void addition() {
		assertEquals(2,c.add(1, 1));
	}
}
