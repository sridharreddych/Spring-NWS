package test;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoInterface;
import model.Student;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/test.xml");
		StudentDaoInterface dao =(StudentDaoInterface)cap.getBean("dao");
		
		/*Student st = new Student();
		st.setId(222);
	    st.setName("xyz");
		st.setEmail("xyz@gmail.com");
		st.setAddress("sec");
		dao.save(st);*/
		
		/*Student st = dao.findbyPk(111);
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getEmail());
		System.out.println(st.getAddress());*/
		
		/*List<Student> list = dao.findAllUsingHQL();
		for(Student st:list)
		{
			System.out.println(st.getId());
			System.out.println(st.getName());
			System.out.println(st.getEmail());
			System.out.println(st.getAddress());
			
		}*/
		
		List<Student> list = dao.findAllUsingCriteria();
		for(Student st:list)
		{
			System.out.println(st.getId());
			System.out.println(st.getName());
			System.out.println(st.getEmail());
			System.out.println(st.getAddress());
			
		}
		
		System.out.println("Success");
		cap.close();
	}
}
