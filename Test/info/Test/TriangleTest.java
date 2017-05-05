package info.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import info.exam.Triangle;

public class TriangleTest {
	Triangle triangle;

	@Before
	public void setUp() throws Exception {
		triangle = new Triangle(4, 5, 6);
	}

	@Test
	public void isTriangletest() {
		boolean result = triangle.isTriangle();
		assertEquals(true, result);

	}

	@Test
	public void getAngleedge1test() {
		double result = triangle.getAngle(6);
		assertEquals(82.81924421854171, result, 0);

	}

	@Test
	public void getAngleedge2test() {
		double result = triangle.getAngle(4);
		assertEquals(41.40962210927086, result, 0);
	}

	@Test
	public void getAngleedge3test() {
		double result = triangle.getAngle(5);
		assertEquals(55.771133672187425, result, 0);

	}

	@Test
	public void notaTriangletest() {
		double result = triangle.getAngle(0);
		assertEquals(0, result, 0);
	}

}
