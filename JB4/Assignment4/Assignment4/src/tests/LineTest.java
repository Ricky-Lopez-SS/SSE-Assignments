package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 */
import com.ss.jb.four.Line;

/**
 * @author Ricky Lopez
 *
 */
public class LineTest {

	Line line = new Line(1, 2, 3, 4);
	Line lineNeg = new Line(-1, -2, -3, -4);
	Line lineParallel = new Line(2, 4, 6, 8);

	@Test
	public void nullTest() {
		assertNull(line.parallelTo(null));
	}

	@Test
	public void equalsTest() {
		assertEquals(line.getSlope(), 1d, .0001);
		assertEquals(line.getDistance(), Math.sqrt(8d), .0001);
		assertTrue(line.parallelTo(lineParallel));

	}

	@Test
	public void negTest() {
		assertEquals(line.getDistance(), lineNeg.getDistance(), .0001);
	}
}
