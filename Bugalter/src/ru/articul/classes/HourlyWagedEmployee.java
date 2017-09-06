package ru.articul.classes;

import ru.articul.interfaces.Employee;
import java.math.BigDecimal;


public class HourlyWagedEmployee extends Employee{                     

    public HourlyWagedEmployee(String name) {

        super(name);

    }


    @Override

    public void calculatingMonthlySalary(Double hourlyRate) {

        monthlySalary = new BigDecimal(20.8 + "").multiply(new BigDecimal(8 + ""))

                .multiply(new BigDecimal(hourlyRate.toString()));

    }
}