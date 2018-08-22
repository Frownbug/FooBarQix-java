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
	public void getStringShouldReturnNumberIfNoReplacement() throws Exception {
		assertEquals("1", fbq.getString(1));
	}
}
