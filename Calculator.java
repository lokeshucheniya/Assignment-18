package in.co.capgemini;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class Calculator {

	@Test
	public void AdditionTest() {
		CalculatorTest calculator = new CalculatorTest();
		int ans = calculator.add(5,5);
		Assert.assertEquals(10, ans);
	}
	
	@Test
	public void SubractionTest() {
		CalculatorTest calculator = new CalculatorTest();
		int ans = calculator.sub(5,5);
		Assert.assertEquals(0, ans);
	}
	
	@Test
	public void MultiplyTest() {
		CalculatorTest calculator = new CalculatorTest();
		int ans = calculator.multiply(5,5);
		Assert.assertEquals(25, ans);
	}
	
	@Test
	public void DivisionTest() {
		CalculatorTest calculator = new CalculatorTest();
		int ans = calculator.divide(5,5);
		Assert.assertEquals(1, ans);
	}
	
	@Test
	public void ModulusTest() {
		CalculatorTest calculator = new CalculatorTest();
		int ans = calculator.mod(5,5);
		Assert.assertEquals(0, ans);
	}
}
