package in.co.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TaxCalculate {
	
	//Instance variables
	private String empName;
	private double empSal;
	private boolean isIndian;
	
	
	//Parameterised Constructor
	public TaxCalculate(String empName, int empSal, boolean isIndian) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.isIndian = isIndian;
	}
	
	//Method CalculatorTax for calculating tax
	public double CalculatorTax() throws EmployeeNameInvalidException, CountryNotValidException, TaxNotElegibleException {
		double taxAmt =0;
		if(isIndian==true) {
			if(empName.isEmpty()) {
				throw new EmployeeNameInvalidException("Employee name can't be null");
			}
			else {
				if(empSal >= 100000) {
					taxAmt = empSal*0.08;
				}
				else if(empSal >=50000 && empSal <= 100000) {
					taxAmt = empSal*0.06;
				}
				else if(empSal >= 30000 && empSal <= 50000) {
					taxAmt = empSal*0.05;
				}
				else if(empSal >= 10000 && empSal <= 30000) {
					taxAmt = empSal*0.04;
				}
				else
					throw new TaxNotElegibleException("Not Eligible For Tax");
			}
		}
		else {
			throw new CountryNotValidException("Country is Not valid");
		}
		return taxAmt;
	}

	
}
