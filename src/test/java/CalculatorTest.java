//package test.java;

//import Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();

	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania() throws Exception {
		double a = 2.0;
		double b = 3.0;

		double c = 4.5;
		double d = 1.2;

		double suma = classUnderTest.sum(a, b);
		double suma2 = classUnderTest.sum(c, d);

		Assert.assertEquals("Bledny wynik sumowania", 5.0, suma, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 5.7, suma2, 0.001);
	}
	@Test
	public void testOdejmowania() throws Exception {
		double a = 3.0;
		double b = 2.0;

		double c = 4.5;
		double d = 1.2;

		double różnica = classUnderTest.subtract(a, b);
		double różnica2 = classUnderTest.subtract(c, d);

		Assert.assertEquals("Bledny wynik sumowania", 1.0, różnica, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 3.3, różnica2, 0.001);
	}

	@Test
	public void testMnozenia() throws Exception {
		double a = 3.0;
		double b = 4.0;

		double c = 4.5;
		double d = 1.2;

		double e = 4.0;
		double f = 0.0;

		double iloczyn = classUnderTest.multiply(a, b);
		double iloczyn2 = classUnderTest.multiply(c, d);
		double iloczyn3 = classUnderTest.multiply(e, f);

		Assert.assertEquals("Bledny wynik sumowania", 12.0, iloczyn, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 5.4, iloczyn2, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 0, iloczyn3, 0.001);
	}
	@Test
	public void testDzielenia() throws Exception {
		double a = 12.0;
		double b = 4.0;

		double c = 11.0;
		double d = 1.1;

		double e = 4.0;
		double f = 0.0;

		double iloraz = classUnderTest.divide(a, b);
		double iloraz2 = classUnderTest.divide(c, d);


		Assert.assertEquals("Bledny wynik sumowania", 3.0, iloraz, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 10.0, iloraz2, 0.001);

		}

		@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero() throws Exception {

		double e = 4.0;
		double f = 0.0;

		double iloraz3 = classUnderTest.divide(e, f);
		}


	}

