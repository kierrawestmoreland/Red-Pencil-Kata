package RedPencilKata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RedPencilTest {

	@Test
	public void shouldReturnOriginalPrice(){
		RedPencil underTest = new RedPencil();
		assertEquals(100, underTest.getOriginalPrice());
	}
	
}
