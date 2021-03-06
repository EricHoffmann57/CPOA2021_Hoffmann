package tests.mathematics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import interfaces.Maths;

public class MathsTest {
	private IMaths maths;

	@Before
	public void setUp() {
		this.maths = new Maths();
	}

	@Test(expected = MathsExceptions.class)
	public void testDivisionParzero() throws MathsExceptions {
		try {
			maths.division(4, 0);
		} catch (MathsExceptions e) {
			Assert.assertEquals(e.getMessage(), "Division par zéro impossible");
			throw e;
		}
	}

	@Test
	public void testAdditionCasGeneralNombrePositif() {
		Assert.assertEquals(maths.addition(2, 3), 5);
	}

	@Test
	public void testAdditionCasGeneralNombreNegatif() {
		Assert.assertEquals(maths.addition(-2, -3), -5);
	}

	@Test
	public void testAdditionCasGeneralNombrePositifEtNul() {
		Assert.assertEquals(maths.addition(0, 3), 3);
	}

	@Test
	public void testAdditionCasGeneralNombreNegatifEtNul() {
		Assert.assertEquals(maths.addition(0, -3), -3);
	}

	@Test
	public void testAdditionCasGeneralNombrePositifEtNegatif() {
		Assert.assertEquals(maths.addition(-2, 3), 1);
	}

	@Test
	public void testAdditionCasGeneralNombreNul() {
		Assert.assertEquals(maths.addition(0, 0), 0);
	}

	@Test
	public void testSoustractionCasgeneralNombrePositifEtNul() {
		Assert.assertEquals(maths.soustraction(3, 0), 3);
	}

	@Test
	public void testSoustractionCasgeneralNombreNegatifEtNul() {
		Assert.assertEquals(maths.soustraction(-3, 0), -3);
	}

	@Test
	public void testSoustractionCasgeneralNombreNul() {
		Assert.assertEquals(maths.soustraction(0, 0), 0);
	}

	@Test
	public void testSoustractionCasgeneralNombreNegatifEtpositif() {
		Assert.assertEquals(maths.soustraction(-3, 3), -6);
	}

	@Test
	public void testSoustractionCasgeneralNombrePositifNegatif() {
		Assert.assertEquals(maths.soustraction(3, -2), 5);
	}

	@Test
	public void testSoustractionCasgeneralNombrePositif() {
		Assert.assertEquals(maths.soustraction(3, 2), 1);
	}

	@Test
	public void testMultiplicationCasgeneralNombrePositif() {
		Assert.assertEquals(maths.multiplication(3, 2), 6);
	}

	@Test
	public void testMultiplicationCasgeneralNombrePositifEtNul() {
		Assert.assertEquals(maths.multiplication(3, 0), 0);
	}

	@Test
	public void testMultiplicationCasgeneralNombreNegatifEtNul() {
		Assert.assertEquals(maths.multiplication(-3, 0), 0);
	}

	@Test
	public void testMultiplicationCasgeneralNombreNegatif() {
		Assert.assertEquals(maths.multiplication(-3, -2), 6);
	}

	@Test
	public void testMultiplicationCasgeneralNombrePositifEtNegatif() {
		Assert.assertEquals(maths.multiplication(3, -2), -6);
	}

	@Test
	public void testMultiplicationCasgeneralNombreNul() {
		Assert.assertEquals(maths.multiplication(0, 0), 0);
	}

	@Test(expected = MathsExceptions.class)
    public void testDivisionCasZero() throws MathsExceptions{
    	try {
    		maths.division(4, 0);
    	}catch (MathsExceptions e) {
    	 	Assert.assertEquals(e.getMessage(), "Division par zéro impossible");
    	throw e;
    	}
    	
    }

	@Test
	public void testDivisionCasgeneralNombrePositif() throws MathsExceptions {
		Assert.assertEquals(maths.division(4, 2), 2, 0);
	}

	@Test
	public void testDivisionCasgeneralNombreNegatif() throws MathsExceptions {
		Assert.assertEquals(maths.division(-4, -2), 2, 0);
	}

	@Test
	public void testDivisionCasgeneralNombreNegatifEtPositif() throws MathsExceptions {
		Assert.assertEquals(maths.division(4, -2), -2, 0);
	}

}
