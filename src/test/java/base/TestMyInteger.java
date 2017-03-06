package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {
	public static MyInteger val; 
	public static MyInteger val2; 
	public static MyInteger val3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		val = new MyInteger(2);
		val2 = new MyInteger(3);
		val3 = new MyInteger(3);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testeven() {
		assertTrue("2 is even ", val.isEven(2));	
	}
	@Test
	public void testodd() {
		assertTrue("3 is odd ", val.isOdd(3));
	}
	@Test
	public void testprime() {
		assertTrue("5 is prime ", val.isPrime(5));
	}
	@Test
	public void testevenInt() {
		assertFalse("3 is not an even int ", val.isEven(3));
	}
	@Test
	public void testoddInt() {
		assertFalse("4 is not an odd int ", val.isOdd(4));
	}
	@Test
	public void testprimeInt() {
		assertFalse("4 is not a prime int ", val.isPrime(4));
	}
	@Test
	public void testevenMyInteger() {
		assertTrue("This number is even ", val.isEven(val));
	}
	@Test
	public void testoddMyInteger() {
		assertTrue("This number is odd ", val.isOdd(val2));
	}
	@Test
	public void testprimeMyInteger() {
		assertTrue("This number is prime ", val.isPrime(val3));
	}
	@Test
	public void equaltestInt() {
		assertTrue("These numbers are equal ", val2.equal(3));
	}
	@Test
	public void equaltestMyInteger() {
		assertTrue("These nunbers are equal ", val2.equal(val3));
	}
}
