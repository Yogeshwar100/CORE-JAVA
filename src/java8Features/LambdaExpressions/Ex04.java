package java8Features.LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class Ex04 {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("Akash", 50000));
		empList.add(new Employee("Sakshi", 25000));
		empList.add(new Employee("Nita", 70000));
		empList.add(new Employee("Amit", 20000));
		empList.add(new Employee("Sanket", 75000));
		
		Predicate<Employee> p=e->e.salary>50000;
		
		for(Employee e:empList) {
			if (p.test(e)) {
				System.out.println(e.name+": "+e.salary);
			}
		}
	}
}
