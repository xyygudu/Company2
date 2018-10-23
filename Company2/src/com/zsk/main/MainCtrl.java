package com.zsk.main;

import java.util.Scanner;

import com.zsk.person.LeaderC;
import com.zsk.person.Parents;
import com.zsk.person.Student;
import com.zsk.person.Teacher;

public class MainCtrl {
	
	public static float totalprice=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents parents=new Parents();
		System.out.println("请输入家长要住的天数：");
		Scanner in=new Scanner(System.in);
		int days=in.nextInt();
		float pPriceOfoneDay=0;//家长总消费
		for(;days>0;days--) {
			pPriceOfoneDay+=parents.eat()+parents.live()+parents.wallk();
		}		
		parents.setPrice(pPriceOfoneDay);
		totalprice+=pPriceOfoneDay;
		System.out.println("家长这几天总过花费："+parents.getPrice());
		Teacher teacher=new Teacher();
		System.out.println("输入老师入住的天数：");
		days=in.nextInt();
		float tPriceOfOneDay=0;//老师一天的总消费
		for(;days>0;days--) {
			tPriceOfOneDay+=teacher.eat()+teacher.live()+teacher.wallk();
		}
		totalprice+=tPriceOfOneDay;
		teacher.setPrice(tPriceOfOneDay);
		System.out.println("老师这几天总过花费："+teacher.getPrice());
		Student student=new Student();
		System.out.println("输入学生入住的天数：");
		days=in.nextInt();
		float sPriceOfOneDay=0;//学生一天的总消费
		for(;days>0;days--) {
			sPriceOfOneDay+=student.eat()+student.live()+student.wallk();
		}
		totalprice+=sPriceOfOneDay;
		student.setPrice(sPriceOfOneDay);
		System.out.println("学生这几天总过花费："+student.getPrice());
		LeaderC leaderC=new LeaderC();
		System.out.println("输入领导入住天数");
		days=in.nextInt();
		float LPriceOfOneDay=0;//领导一天的总消费
		for(;days>0;days--) {
			LPriceOfOneDay+=leaderC.eat()+leaderC.live()+leaderC.wallk();
		}
		totalprice+=LPriceOfOneDay+leaderC.giftPrice();
		System.out.println("领导这几天消费"+LPriceOfOneDay);
		System.out.println("总共消费："+totalprice);
	}

}
