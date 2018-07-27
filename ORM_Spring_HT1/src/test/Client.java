package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoInterface;
import model.Student;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/test.xml");
		StudentDaoInterface dao =(StudentDaoInterface)cap.getBean("dao");
		
		Student st = new Student();
		
		st.setId(111);
	    st.setName("abc");
		st.setEmail("abc@gmail.com");
		st.setAddress("hyd");
		dao.save(st);
		System.out.println("Success");
		cap.close();
	}
}
