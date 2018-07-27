package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;


public class Client {

	public static void main(String[] args) {

		ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("resources/spring.xml");
		Bank bproxy = (Bank) cap.getBean("proxy");
				
		int amount = bproxy.deposit("sbi123", 5000);
	/*	int amount = bproxy.findBal("sbi123");*/
		System.out.println(amount);
		cap.close();
	}
}
