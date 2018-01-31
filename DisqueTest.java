package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class DisqueTest extends TestCase {

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(-1, petit.compareTo(moyen));
		assertEquals(-1, moyen.compareTo(grand));
	
		//TODO : à compléter


		assertTrue(petit.compareTo(moyen) == -1);
		assertTrue(moyen.compareTo(grand) == -1);
	}

}
