package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Bus;
import beans.Car;
import beans.Truck;

public class client 
{

	public static void main(String[] args){
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		// check xml document
		// it will create instances to singleton beans
		
		System.out.println("..............CAR ...................");
		Car c =(Car)ap.getBean("c");
		System.out.println(c.myCarEngine().getClass());
		System.out.println(c.getClass().getCanonicalName());
		System.out.println(c.myCarEngine().getName());
		
		System.out.println("..............BUS ...................");
		Bus b =(Bus)ap.getBean("b");
		System.out.println(b.myBusEngine().getClass());
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.myBusEngine().getName());
		
		System.out.println("..............TRUCK ...................");
		Truck t =(Truck)ap.getBean("t");
		System.out.println(t.myTruckEngine().getClass());
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.myTruckEngine().getName());
		
		
	}
}
