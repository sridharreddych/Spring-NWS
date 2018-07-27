package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client
{
public static void main(String args[])
{
//find xml
Resource r = new ClassPathResource("resources/spring.xml");
//load xml into the container class (the container is BeanFactory)
BeanFactory factory = new XmlBeanFactory(r);


//ApplicationContext ap = new classPathXmlApplicationContext("resource/spring.xml");
//ap.getBean("t");
//ap.getBean("t");

//create test class object
Object o1 = factory.getBean("t");
Object o2 = factory.getBean("t");
Object o3 = factory.getBean("t");

System.out.println(o1==o2);
System.out.println(o1==o2);

Test t = (Test)o1;
t.hello();


}
}