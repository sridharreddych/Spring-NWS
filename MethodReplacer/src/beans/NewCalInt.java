package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalInt implements MethodReplacer {

	@Override
	public Object reimplement(Object o, Method m, Object[] param) throws Throwable {
		
		System.out.println("NewCalIn  class new CalInt implementation");
		return o;
	}

}
