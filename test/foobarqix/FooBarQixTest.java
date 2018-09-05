package foobarqix;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class FooBarQixTest {
	@InjectMocks
	private FooBarQix fbq;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void computeShouldReturnNumberIfNoReplacement() throws Exception {
		assertEquals("1", fbq.compute("1"));
		assertEquals("2", fbq.compute("2"));
		assertEquals("11", fbq.compute("11"));
	}
	@Test
	public void computeShouldReturnNumberReplacement() throws Exception {
		assertEquals("Foo", fbq.compute("6"));
		assertEquals("Bar", fbq.compute("10"));
		assertEquals("Qix", fbq.compute("14"));
		assertEquals("Foo", fbq.compute("13"));
		assertEquals("Bar", fbq.compute("10"));
		assertEquals("Qix", fbq.compute("17"));
	}
}
