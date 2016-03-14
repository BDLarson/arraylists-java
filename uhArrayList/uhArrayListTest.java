package uhArrayList;
import org.junit.Test;
import junit.framework.TestCase;
import uhCollection.UhArrayList;

public class uhArrayListTest extends TestCase {
	@Test
	public void testConstruct() { //Test both constructors
		UhArrayList a1 = new UhArrayList();
		UhArrayList a2 = new UhArrayList(10);
		
		assertEquals(4, a1.capacity());
		assertEquals(0, a1.size());
		assertEquals(10, a2.capacity());
		assertEquals(0, a2.size());
	}
	
	@Test
	public void testAdd() { //Test add method
		final int 	NUM_ADDS=1000;
		UhArrayList al = new UhArrayList();
		UhArrayList al2 = new UhArrayList(10);
		
		for (int i = 0; i < NUM_ADDS; i++) {
			al.add(Integer.valueOf(i));
		}
		
		assertEquals(NUM_ADDS, al.size());
		
		// This works since the array capacity is increased by 4 and 1000 
		// is divisible by 4.  This may break if a different algorithm
		// or constant was used to expand the capacity.
		assertEquals(NUM_ADDS, al.capacity());
		
		for (int i = 0; i < NUM_ADDS; i++) {
			Integer val;
			
			val = (Integer)al.get(i);
			assertEquals(Integer.valueOf(i), val);
		}
		
		//Test the add(index) method
		Integer val = 1;
		al2.add(0, val);
		assertEquals(al2.size(),1);
		assertEquals(al2.get(1), val);
		
	}
	
	@Test
	public void testRemove() {
		final int NUM_ADDS=1000;
		UhArrayList ar = new UhArrayList();
		
		for (int i = 0; i<NUM_ADDS; i++){
			ar.add(Integer.valueOf(i));
		}
		ar.size();
		ar.remove(10);
		assertEquals(ar.size(), 999);
		
		
	}
	
	@Test
	public void testGet() {
		UhArrayList ag = new UhArrayList();
		Object o = new Object();
		ag.add(o);
		assertEquals(ag.get(0), o);
		
		assertEquals(ag.get(1), null);
		
		// What do I need to test?
		// 1. Make sure "get" returns the correct value for valid index.
		// 2. Make sure "get" properly handles an invalid index.
	}
}

