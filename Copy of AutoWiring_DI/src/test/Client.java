package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;

public class Client {

	public static void main(String[] args){
		/*ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");*/
		/*ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring_autodetect.xml");
		Bus b = (Bus)ap.getBean("b");
				b.printData();*/
		
		/*ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Car c = (Car)ap.getBean("c");
		c.printData();*/
		
		/*ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring_byType_sri.xml");
		Car c = (Car)ap.getBean("c");
		c.printData();*/
		
		/*ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring_byName.xml");
		Car c = (Car)ap.getBean("c");
		c.printData();*/
		
		/*ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring_constructor.xml");
		Bus b = (Bus)ap.getBean("b");
		b.printData();*/
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring_autodetect.xml");
		Bus b = (Bus)ap.getBean("b");
		b.printData(); /* keep commenting default constructor, setter and parametrized constructor and see results */
	}
}
