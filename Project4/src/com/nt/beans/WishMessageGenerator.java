package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	public WishMessageGenerator(Date date) {
		System.out.println(date);
		System.out.println("Wish message zero param contructor..");
		this.date=date;
	}
	public String generateWishMessage(String user) {
		System.out.println(date);
		int hour=0;
		if(hour<12)
			return "GM::"+user;
		else if(hour<16)
			return "GA::"+user;
		else if(hour<20)
			return "GE::"+user;
		else
			return "GN::"+user;
	}
	

}
