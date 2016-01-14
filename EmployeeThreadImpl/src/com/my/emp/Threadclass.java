package com.my.emp;

public class Threadclass implements Runnable{

	@Override
	public void run() {
		EmployeeRegister.registerEmployee("Tanish");
		EmployeeRegister obj = new EmployeeRegister();
		
		obj.updateList();
	}
	public void start(){
		run();
	}

}
