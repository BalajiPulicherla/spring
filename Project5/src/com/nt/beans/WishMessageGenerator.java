package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date=null;

	public WishMessageGenerator() {
		System.out.println("zero param constructor...");
	}
	public void setDate(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator");
		this.date=date;
	}
	public WishMessageGenerator(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator one param-constructor");
		this.date=date;
	}
	public String GenerateWishMessage(String user) {
		int hour=0;
		if (hour<12)
		return "GM::"+user;
		else if(hour<4)
			return "GA::"+user;
		else if(hour<8)
			return "GE::"+user;
		else
			return "GN::"+user;
	}
	

}
