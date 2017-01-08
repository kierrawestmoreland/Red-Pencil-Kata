package RedPencilKata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RedPencilTest {

	@Test
	public void shouldReturnOriginalPrice(){
		RedPencil underTest = new RedPencil();
		assertEquals(100, underTest.getOriginalPrice());
	}
	
	@Test
	public void priceReductionShouldStartSale(){
		RedPencil underTest = new RedPencil();
		assertTrue(underTest.isOnSale());
	}
	
}
