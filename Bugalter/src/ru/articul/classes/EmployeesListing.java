package ru.articul.classes;
import ru.articul.interfaces.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeesListing {

	List employees;
	
	public EmployeesListing() {
		this.employees = new ArrayList<>();
	}
    public void addHourlyWagedEmployee(String name, double hourlyRate) {
    	Employee employee = new HourlyWagedEmployee(name);
    	employee.calculatingMonthlySalary(hourlyRate);
    	employees.add(employee);
    }
    public void addFixedPaymentEmployee(String name, double hourlyRate) {
    	Employee employee = new FixedPaymentEmployee(name);
    	employee.calculatingMonthlySalary(hourlyRate);
    	employees.add(employee);
    }
    
    public List getEmployees() {
    	return employees;
    }
    public int compare(Employee e1, Employee e2) {
    	int comparison = e2.getMonthlySalary().compareTo(e1.getMonthlySalary());
    	if (comparison !=0) {
    		return comparison;
    	} else {
    		return e1.getName().compareTo(e2.getName());
    	}
    }

}

