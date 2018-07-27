package com.ss.ems.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ss.ems.bo.StudentBoInterface;
import com.ss.ems.model.Student;


@WebServlet("/empsave")
public class EmpSaveController extends HttpServlet {

	ConfigurableApplicationContext cap;
	
	@Override
	public void init() throws ServletException {
	
		 cap = new ClassPathXmlApplicationContext("resources/test.xml");
		
	}
	
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 int id = Integer.parseInt(req.getParameter("id"));
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 String address = req.getParameter("address");
		 
		 //from controller send data to business.
		 StudentBoInterface bo = (StudentBoInterface)cap.getBean("bo");
		 
		 Student st = new Student();
		 st.setId(id);
		 st.setName(name);
		 st.setEmail(email);
		 st.setAddress(address);
		 int i = bo.createStudent(st);
		 if(i!=0)
			 resp.getWriter().println("succcess");
		 else
			 resp.getWriter().println("fail");
		}

	 @Override
	public void destroy() {
		cap.close();
		
	}
}

