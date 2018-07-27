package test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t1 = (Test)ap.getBean("t");
		Test t2 = (Test)ap.getBean("t");
		System.out.println(t1==t2);
		Calendar c1 = (Calendar)ap.getBean("c");
		Calendar c2 = (Calendar)ap.getBean("c");
		System.out.println(c1==c2);
	    //System.out.println(c.getCalendarType());
	}
}
