package ex2;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class EllipseTest {

	static Ellipse ellipse1;
	static Ellipse ellipse2;

	@BeforeClass
	public static void setup() {
		System.out.println("Set the objects");
		ellipse1 = new Ellipse(3.0, 3.0);
		ellipse2 = new Ellipse(0.5, 0.5);
	}
	
	@Test
	public void test4() throws InvalidShape {
		assertEquals(ellipse1.area(), 28.27433, 0);
	}
	
	@Test
	public void test5() throws InvalidShape {
		assertEquals(ellipse2.area(), 0.7854, 0);
	}
}
