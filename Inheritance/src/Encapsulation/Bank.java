package Encapsulation;

public class Bank {
	private double money;
	private String name;
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public void calc() {
	money=money*2;
}

}
