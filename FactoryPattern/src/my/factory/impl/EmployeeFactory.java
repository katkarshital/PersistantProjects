package my.factory.impl;

public class EmployeeFactory {
	
	
	public Employee createEmp(String type){
		Employee emp =null;
		if(type =="Regular"){
			emp = new Permenant(111,"Shital1",8000,500);
			
		}else if(type =="Sales"){
			emp = new SalesPerson(111,"Shital2",8000,10000);
		}else{
			emp = new Employee(111,"Shital3",8000);
		}
		return emp;
	}
	
	public static void main(String[] args){
		EmployeeFactory obj = new EmployeeFactory();
		Employee myEmp = obj.createEmp("Sales");
		System.out.print(myEmp.getClass().getName());
	}

}
