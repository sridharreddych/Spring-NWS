package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;

public class Client {

	public static void main(String[] args){
		/*ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");*/
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring_autodetect.xml");
		Bus b = (Bus)ap.getBean("b");
				b.printData();
	}
}
