package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjection {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator wish=null;
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		wish=(WishMessageGenerator)factory.getBean("wmg");
		System.out.println("Result is::"+wish.generateWishMessage("balu"));
	}

}
