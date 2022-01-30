package Aggregation;

public class Bank {
	private int pinNo;


	public int getPinNo() {
		return pinNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	public int validatePin(int pin) {
		
		if((pin==1001)||(pin==1234)||(pin==1212))
		{
			System.out.println("You Entered a valid pin");
			
		}
		else {
			
			System.out.println("You Entered a invalid pin");
			
		
		
		}
		return pin;
		}
	}

