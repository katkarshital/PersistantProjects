package com.my.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {
	private static List<Employee> list = new ArrayList<Employee>();
	public static void main(String[] args){
		Employee emp1 = new Employee(11,"AAA");
		Employee emp2 = new Employee(12,"DDD");
		Employee emp3 = new Employee(13,"BBB");
		Employee emp4 = new Employee(14,"HHH");
		Employee emp5 = new Employee(15,"GGG");
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		try {
			startThreads();
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	}
	


	public static synchronized void registerEmployee(String e){
		for(int i=0;i<list.size();i++){
			System.out.println("Clerk with name "+e+" registered employee  with Id"+
					list.get(i).getId() + "  and name = "+list.get(i).getName() );
		}
	
	}
	
	public static void startThreads() throws InterruptedException{
		Threadclass thread1 = new Threadclass();
		Threadclass thread2 = new Threadclass();
		Threadclass thread3 = new Threadclass();
		Threadclass thread4 = new Threadclass();
		Threadclass thread5 = new Threadclass();
		//Thread t1 = new Thread(thread1);
		//t1.run();
		//t1.sleep(1000);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
	}
	
	
	public void updateList(){
		synchronized(list){
			for(int i=0;i<list.size();i++){
				list.get(i).setId(100*i);
			}
			
		}
	}
}
