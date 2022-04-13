package week6;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TemperaturesTest {

//	60 -50
	static Temperatures temp;
	
	@BeforeClass
	public static void setup() {
		System.out.println("Is it called always");
		temp = new Temperatures();
	}
	
	@Test
	public void test1() throws InvalidTemp {
		temp.add(-10);
		assertEquals(temp.min(), -10);
	}
	
//	(expected = InvalidTemp.class)
	@Test
	public void test2() throws InvalidTemp {
		temp.add(-40);
	}
	
	@Test(expected = InvalidTemp.class)
	public void test3() throws InvalidTemp {
		temp.add(70);
	}
	
	@Test
	public void test4() throws InvalidTemp {
		temp.add(20);
		assertEquals(temp.min(), -40);
	}
	
	@Test
	public void test5() throws InvalidTemp {
		temp.add(-45);
		assertEquals(temp.min(), -45);
	}
}
