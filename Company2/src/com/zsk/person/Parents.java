package com.zsk.person;

import java.util.Scanner;

import com.zsk.interf.Menber;

public class Parents implements Menber {
	private float price;
	private String from;//来自哪里
	private String to;//到哪里去
	private Scanner in;
	
	public Parents() {
		// TODO Auto-generated constructor stub
		in=new Scanner(System.in);
		System.out.println("输入家长从哪里来,到哪里去");
		from = in.next();
		to=in.next();		
	}

	@Override
	public float eat() {
		// TODO Auto-generated method stub
		float priceofeat=30;	
		return priceofeat;
	}

	@Override
	public float live() {
		// TODO Auto-generated method stub
		float priceoflive=100;
		return priceoflive;
	}

	@Override
	public float wallk() {
		// TODO Auto-generated method stub
		float priceofwallk=30;
		return 0;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}

}
