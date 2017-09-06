package ru.articul.interfaces;
import java.math.BigDecimal;

public abstract class Employee {
   static int numberClasses = 0;
   
   protected int id;
   protected String name;
   protected BigDecimal monthlySalary;
	
   public Employee(String name) {
	   numberClasses++;
	   this.id = numberClasses;
	   this.name = name;
	   
   }
   
   public BigDecimal getMonthlySalary() {
	   return monthlySalary;
   }
	
   public String getName() {
	   return name;
   }
	
   public int getId() {
	   return id;
   }


   public void setId(int id) {
	   this.id = id;
   }
	
	public abstract void calculatingMonthlySalary(Double sallary);
	
}
