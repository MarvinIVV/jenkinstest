package jenkinstest;

import static org.junit.Assert.*;

import org.junit.Test;

public class rechnentest {

	@Test
	public void test() {
		Rechner rechner = new Rechner();
		
		int result = rechner.rechnen(10, 89);
		
		assertEquals(99, result);
		
		result = rechner.rechnen(5, 79);
		
		assertEquals(89, result);
	}

}
