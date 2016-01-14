package my.singleton.demo;

public class Employee {
	private int id;
	private String name;
	private int BaseSalary;
	
	Employee(int id,String name, int sal){
		this.id = id;
		this.name= name;
		this.BaseSalary = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int calculateSalary(){
		return BaseSalary;
	}

}
