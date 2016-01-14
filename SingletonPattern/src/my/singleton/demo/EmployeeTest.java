package my.singleton.demo;

public class EmployeeTest
{
	private static Employee instance=null;

	private void EmployeeTest()
	{
		instance = new Employee(123,"TEst",345);
	System.out.println("EmployeeTest(): Initializing Instance");
	}

	public static Employee getInstance()
	{
		if (instance == null)
		{
			synchronized(EmployeeTest.class)
			{
				if (instance == null)
				{
					System.out.println("getInstance(): First time getInstance was invoked!");
					 new EmployeeTest();
				}
			}            
		}

		return instance;
	}

	public void printData()
	{
		System.out.println("Empolee details !" + instance.getId() + "		"+instance.getName());
	}
	
	public static void main(String[] args){
		EmployeeTest obj =null;
		obj.getInstance();
		obj.printData();
	}
}
