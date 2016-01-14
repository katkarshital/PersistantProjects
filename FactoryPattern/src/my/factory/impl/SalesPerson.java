package my.factory.impl;

public class SalesPerson extends Employee{

	private int sales;
	SalesPerson(int id, String name, int sal,int sales) {
			super(id, name, sal);
			this.sales = sales;		
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	

}
