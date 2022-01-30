package Encapsulation;


public class ClassAddress {
	private String houseName;	
	private String place;
	private String state;
	private int pinCode;
private ClassStudent stnd;
	
public String getHouseName() {
		return houseName;
	}

public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

public String getPlace() {
		return place;
	}

public void setPlace(String place) {
		this.place = place;
	}

public String getState() {
		return state;
	}

public void setState(String state) {
		this.state = state;
	}


public int getPinCode() {
		return pinCode;
	}


public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}




public ClassStudent getStnd() {
	return stnd;
}

public void setStnd(ClassStudent stnd) {
	this.stnd = stnd;
}

public void display() {
	System.out.println("Name :"+getStnd().getName());
	System.out.println("Roll Number :"+getStnd().getRollNumber());
	System.out.println("House Name :"+getHouseName());
	System.out.println("Place :"+getPlace());
	System.out.println("Pin Code :"+ getPinCode());

}



	

}
