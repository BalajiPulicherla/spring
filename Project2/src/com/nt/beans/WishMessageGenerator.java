package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	public void setDate(Date date) {
		this.date=date;
	}
	public String generatorWishMessage(String user) {
		int hour=0;
		hour=date.getHours();
		if(hour<12)
			return "GM::"+user;
		else if(hour<4)
			return "GA::"+user;
		else if(hour<8)
			return "GE::"+user;
		else
			return "GN::"+user;
	}

}
