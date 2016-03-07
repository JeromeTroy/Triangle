package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	
	@Test
	public void testDefault() {
		Triangle T1 = new Triangle();
		assertTrue(T1.getSide1() == 1);
		assertTrue(T1.getSide2() == 1);
		assertTrue(T1.getSide3() == 1);
	}
	@Test
	public void testNew(){
		Triangle T2 = new Triangle(3,4,5);
		assertTrue(T2.getSide1() == 3);
		assertTrue(T2.getSide2() == 4);
		assertTrue(T2.getSide3() == 5);
	}
	
	@Test
	public void testPerimeter(){
		Triangle T3 = new Triangle();
		assertTrue(T3.getPerimeter() == 3);
	}
	
	@Test 
	public void testArea(){
		Triangle T4 = new Triangle(3,4,5);
		Triangle T5 = new Triangle();
		assertTrue(T4.getArea() == 6);
		assertTrue(T5.getArea() == Math.sqrt(3)/4);
	}
	@Test
	public void testString(){
		Triangle T6 = new Triangle();
		T6.setColor("Green");
		T6.setFilled(true);

	}
}
