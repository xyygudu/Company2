package com.zsk.person;

import java.util.Scanner;

import com.zsk.interf.Menber;

public class Student implements Menber{
	private float price;
	private String from;//来自哪里
	private String to;//到哪里去
	private Scanner in;
	public Student() {
		// TODO Auto-generated constructor stub
		in=new Scanner(System.in);
		System.out.println("输入学生从哪里来,到哪里去");
		from = in.next();
		to=in.next();		
	}
	@Override
	public float eat() {
		// TODO Auto-generated method stub
		return 25;
	}
	@Override
	public float live() {
		// TODO Auto-generated method stub
		return 70;
	}
	@Override
	public float wallk() {
		// TODO Auto-generated method stub
		return 42;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
}
