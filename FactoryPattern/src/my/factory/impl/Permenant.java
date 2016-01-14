package my.factory.impl;

public class Permenant extends Employee{
	private int bonus;
	Permenant(int id, String name, int sal,int bonus) {
		super(id, name, sal);
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	

}
