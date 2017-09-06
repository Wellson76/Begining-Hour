package ru.articul.classes;
import ru.articul.interfaces.Employee;
import java.util.List;

public class View {

	public void showEmployees(List employees) {
		System.out.println("id\t\tname\t\t\tmonthly salary");
		System.out.println("----------------------------------------");
		for (int i = 0; i < employees.size(); i++) {
			String row = ((Employee)(employees.get(i))).getId() + "\t\t" + ((Employee)(employees.get(i))).getName();
			int lengthWordInTabs = (((Employee)(employees.get(i))).getName().length()) /4;
		for (int j = 0; j < 5 - lengthWordInTabs; j++) {
			row += "\t";
		}
		row += ((Employee)(employees.get(i))).getMonthlySalary();
		System.out.println(row);
		}
		System.out.println("-----------------------------------\n");
	}

}
