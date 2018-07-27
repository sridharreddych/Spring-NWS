package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		
		/*MethodInvokingFactoryBean m= new MethodInvokingFactoryBean();
		m.setArguments(arguments);
		m.setStaticMethod(staticMethod);*/
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Car c = (Car)ap.getBean("c");
		c.printCar();
		
	}
}
