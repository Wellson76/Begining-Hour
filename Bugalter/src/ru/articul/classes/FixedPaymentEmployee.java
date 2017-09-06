package ru.articul.classes;

import ru.articul.interfaces.Employee;
import java.math.BigDecimal;

public class FixedPaymentEmployee extends Employee {
	
	public FixedPaymentEmployee(String name) {
		super(name);
	}
	@Override
	public void calculatingMonthlySalary(Double fixedSallary) {
		monthlySalary = new BigDecimal(fixedSallary.toString());
	}
}
