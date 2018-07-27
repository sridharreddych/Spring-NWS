package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.StudentBo;
import model.Student;

public class Client {

	public static void main(String[] args)throws Exception {
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/test.xml");
		StudentBo stbo = (StudentBo)cap.getBean("bo");
		
		int i = stbo.createStudent(new Student(111,"sridhartest1","sridhar@gmail.com","Hyd1"));
	
		System.out.println(i);
		cap.close();
	}
}
