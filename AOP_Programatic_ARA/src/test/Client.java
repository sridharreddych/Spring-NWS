package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import service.LogAfterService;

public class Client {

	public static void main(String[] args) {

		//create target
		Bank b = new Bank();
		//create advice
		LogAfterService lbs = new LogAfterService();
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
