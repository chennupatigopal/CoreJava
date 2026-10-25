package com.practice.maps;

import java.util.*;

public class GetSecondHighestElement {

	public static void main(String[] args) {

		Map<Integer, Employee> employees = new HashMap<>();

		employees.put(100, new Employee("lohit", 3000));
		employees.put(101, new Employee("diyan", 7000));
		employees.put(102, new Employee("rohit", 10000));
		employees.put(103, new Employee("jay", 15000));
		employees.put(104, new Employee("sam", 23000));
		employees.put(105, new Employee("tom", 20000));
		employees.put(106, new Employee("pam", 2000));

		Optional<Integer> secondHighestSal = employees.values().stream().map(Employee::getSalary).distinct()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst();

		System.out.println("Second highest Sal::" + secondHighestSal.get());

		Optional<Employee> secondHighEmp = employees.values().stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst();

		System.out.println("Second highest sal Emp::" + secondHighEmp);

	}

}

class Employee {
	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	String name;
	Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
