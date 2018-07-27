package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import service.LogBeforeService;

public class Client {

	public static void main(String[] args) {

		//create target
		Bank b = new Bank();
		//create advice
		LogBeforeService lbs = new LogBeforeService();
		//add target+advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
/*		pfb.setInterceptorNames(new String[]{"lbs"});*/
		pfb.addAdvice(lbs);
		
		//get Generated Proxy object
		Bank bproxy = (Bank)pfb.getObject();
		int amount = bproxy.deposit("sbi123", 5000);
		System.out.println(amount);
	}
}
