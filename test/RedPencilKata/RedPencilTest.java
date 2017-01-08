package RedPencilKata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RedPencilTest {

	RedPencil underTest;
	
	@Before
	public void runBeforeEachTest(){
		underTest = new RedPencil(100, 80);
	}
	
	@Test
	public void shouldReturnOriginalPrice(){
		assertEquals(100, underTest.getOriginalPrice(), 0);
	}
	
	@Test
	public void priceReductionShouldStartSale(){
		assertTrue(underTest.isOnSale());
	}
	
	@Test 
	public void saleCantBeMoreThan30Days(){
		assertTrue(underTest.isOnSale(25));
	}
}
