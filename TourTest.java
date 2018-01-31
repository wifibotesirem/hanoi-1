package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;

public class TourTest extends TestCase {

	@Test
	public void test(Tour t) {

		Tour t = new Tour(3);
		Disque d = new Disque(1);
		try{
		t.empiler(d);
		}catch(FullTowerException e){}
		Disque d2 = t.depiler();
		assertTrue(d.compareTo(d2)==0);
	

	}

	

}
