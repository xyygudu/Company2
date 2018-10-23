package com.zsk.person;

import java.util.Scanner;

import com.zsk.interf.Leader;

public class LeaderC implements Leader{
	private float price;
	private String from;//来自哪里
	private String to;//到哪里去
	private Scanner in;
	public LeaderC() {
		// TODO Auto-generated constructor stub
		in=new Scanner(System.in);
		System.out.println("输入领导从哪里来,到哪里去");
		from = in.next();
		to=in.next();	
	}
	
	@Override
	public float giftPrice() {
		// TODO Auto-generated method stub
		return 300;
	}
	@Override
	public float eat() {
		// TODO Auto-generated method stub
		return 200;
	}
	@Override
	public float live() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	public float wallk() {
		// TODO Auto-generated method stub
		return 100;
	}

}
