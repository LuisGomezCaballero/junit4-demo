package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyObjectTest {

	@Test
	public void testMyMethod() {

		MyObject myObject = new MyObject();

		assertEquals(myObject.myMethod(), "myString");
	}

}
