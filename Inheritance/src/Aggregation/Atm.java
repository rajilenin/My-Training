package Aggregation;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int pin;
Scanner myObj=new Scanner(System.in);
Bank obj1=new Bank();
System.out.println("Enter a valid pin:");
obj1.setPinNo(myObj.nextInt());

pin=obj1.validatePin(obj1.getPinNo());
if((pin==1001)||(pin==1234)||(pin==1212)) {
System.out.println("Enter amount to withdraw");
int amount=myObj.nextInt();
System.out.println("amount processed: "+amount);
	}
	}
}
