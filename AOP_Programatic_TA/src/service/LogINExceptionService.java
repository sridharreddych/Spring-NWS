package service;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import business.Bank;

public class LogINExceptionService implements ThrowsAdvice{

	// in case of throws advice you no need to override any method here, it is not forcing us to put any methods here right.
	//at run time your proxy will add 5 methods, from that 5 methods you can write any method here, that method implementation
	//proxy will not provide, it will left that method, the remaining methods implementation, it will provide.dummy implementaitons/.
	//if you override any method for that method, it will not provide any implementation, at run time, proxy will provide 5 methods
	// implementations, in case if you override any method here, that method implementation it will not provide, so override one method,
	// from that 5 methods.
	
	public void afterThrowing(Exception e)
	{
		
		Log l = LogFactory.getLog(Bank.class);
		l.info("in case of exception in deposit:"+e.getMessage()); // this code need to execute when, incase if you enter wrong account number then only it need to execute.
		
	}
}
