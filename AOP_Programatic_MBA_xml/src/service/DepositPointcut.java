package service;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class c) {
		String methodname= m.getName();
		if(methodname.equals("deposit"))
			return true;
		else
			return false;
	}

}
