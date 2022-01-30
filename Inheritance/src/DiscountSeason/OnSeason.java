package DiscountSeason;

public class OnSeason extends OffSeason {
	public void discount(float price) {
		float discount=price*40/100;
		System.out.println("Discount given in OnSeason :" +discount);
		
		super.discount(1000f);
	
	}

	public static void main(String[] args) {
		OnSeason obj=new OnSeason();
		obj.discount(2000f);
		//OffSeason obj2=new OffSeason();
		//obj2.discount(1000f);
	}

}
