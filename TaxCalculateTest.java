package in.co.capgemini;

import org.junit.Test;

import junit.framework.Assert;

public class TaxCalculateTest {
	
	//Test cases for various Possibilites
	@SuppressWarnings("deprecation")
	@Test(expected=CountryNotValidException.class)
	public void test1() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotElegibleException {
		TaxCalculate taxcal = new TaxCalculate("Ron",34000,false);
		double tax = taxcal.CalculatorTax();
	}
	
	@Test(expected=TaxNotElegibleException.class)
	public void test2() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotElegibleException {
		TaxCalculate taxcal = new TaxCalculate("Tim",1000,true);
		double tax = taxcal.CalculatorTax();
	}
	
	@Test
	public void test3() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotElegibleException {
		TaxCalculate taxcal = new TaxCalculate("jack",55000,true);
		double tax = taxcal.CalculatorTax();
		//double val=new Double(3300);
		Assert.assertEquals(3300.00, tax);
		
	}
	
	@Test(expected=EmployeeNameInvalidException.class)
	public void test4() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotElegibleException {
		TaxCalculate taxcal = new TaxCalculate("",55000,true);
		double tax = taxcal.CalculatorTax();
	}
	
	
	
}
