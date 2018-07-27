package service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		Log l =LogFactory.getLog(Bank.class); //changed this.class to Bank.class
		l.info("deposit method ......");
	}

}
