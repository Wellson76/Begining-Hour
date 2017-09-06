package ru.articul.main;
import ru.articul.interfaces.Employee;
import ru.articul.classes.EmployeesListing;
import ru.articul.classes.FileManager;
import ru.articul.classes.View;
import java.util.List;




public class Main {

	public static void main(String[] args) {
		EmployeesListing listing = new EmployeesListing();
		
		listing.addFixedPaymentEmployee("Petr", 25000);
        listing.addFixedPaymentEmployee("Gena", 20000);
        listing.addFixedPaymentEmployee("Lena", 17000);
        listing.addFixedPaymentEmployee("Valentin", 7000);
        listing.addFixedPaymentEmployee("Vladimir", 15000);
        listing.addFixedPaymentEmployee("Mihail", 15000);
        listing.addFixedPaymentEmployee("Dmitriy", 20000);
        listing.addFixedPaymentEmployee("U178", 5000);
        listing.addHourlyWagedEmployee("Wellson", 30);
        listing.addHourlyWagedEmployee("Stepan", 35);
        listing.addHourlyWagedEmployee("Nikolay", 40);
        listing.addHourlyWagedEmployee("Sergei", 40);
	
	
	    List employees = listing.getEmployees();
	    
	    View view = new View();
	    view.showEmployees(employees);
	    
	    FileManager fileManager = new FileManager("employees");
	    fileManager.createFile();
	    fileManager.writeInFile(employees);
	    fileManager.getEmployeesFromFile();
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	