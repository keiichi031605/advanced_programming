package ex2;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import week6.InvalidTemp;
import week6.Temperatures;

import org.junit.Test;

public class SquareTest {
	
	static Square square1;
	static Square square2;
	static Square square3;


	@BeforeClass
	public static void setup() {
		System.out.println("Set the objects");
		square1 = new Square(3.0);
		square2 = new Square(0.5);
		square3 = new Square(10);
	}
	
	@Test
	public void test1() throws InvalidShape {
		assertEquals(square1.area(), 9.0, 0);
	}
	
	@Test
	public void test2() throws InvalidShape {
		assertEquals(square2.area(), 0.25, 0);
	}

	@Test(expected = InvalidShape.class)
	public void test3() throws InvalidShape {
		square3.area();
	}
}
