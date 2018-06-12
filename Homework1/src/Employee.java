import java.util.*;
import java.lang.*;
import java.io.*;

//QUESTION 7


public class Employee {
	
	String name, department;
	int age;
	
	public Employee(String name, String department, int age){
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
	public String toString(){
        return this.name + " " + this.department +" " + this.age;
    }
	
	static class SortByName implements Comparator<Employee>{
		public int compare(Employee a, Employee b){
			return a.name.compareTo(b.name);
		}
	}
	
	static class SortByDept implements Comparator<Employee>{
		public int compare(Employee a, Employee b){
			return a.department.compareTo(b.department);
		}
	}
	
	static class SortByAge implements Comparator<Employee>{
		
		public int compare(Employee a, Employee b){
			return a.age - b.age;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(new Employee("matthew", "a", 24));
		ar.add(new Employee("peter", "b", 300));
		ar.add(new Employee("johnny", "c", 44));
		System.out.println(ar);
		
		System.out.println("\nsort by name");
		Collections.sort(ar, new SortByName());
		for (int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		System.out.println("\nsort by dept");
		Collections.sort(ar, new SortByDept());
		for (int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		System.out.println("\nsort by age");
		Collections.sort(ar, new SortByAge());
		for (int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
			
		
	}

}
