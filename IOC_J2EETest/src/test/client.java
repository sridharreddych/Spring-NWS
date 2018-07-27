package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client 
{

	public static void main(String[] args){
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		// check xml document
		// it will create instances to singleton beans
		ap.getBean("t");
		ap.getBean("t");
		ap.getBean("t");
	}
}
