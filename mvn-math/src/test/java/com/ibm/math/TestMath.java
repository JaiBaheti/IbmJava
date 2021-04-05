package com.ibm.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMath {
	private static Maths math;
	
	@BeforeAll
	public static void setup() {
		math = new Maths();
	}
	@Test
	public void testAdd() {
		assertEquals(10,math.add(5, 5))
;	}
	@Test
	public void testSub() {
		assertEquals(5,math.sub(10, 5));
	}
	@Test
	public void testDiv() {
		assertEquals(2,math.div(10, 5));
	}
	@Test
	public void invalidDiv() {
		assertThrows(ArithmeticException.class,()->math.div(10,0));
	}
	
}
