package com.ss.ems.bo;

import com.ss.ems.dao.StudentDaoInterface;
import com.ss.ems.model.Student;

public class StudentBoImpl implements StudentBoInterface {

	
	private StudentDaoInterface sdao;
	
	public void setSdao(StudentDaoInterface sdao) {
		this.sdao = sdao;
	}
	
	@Override
	public int createStudent(Student st) {
		
		return sdao.save(st);
	}

	@Override
	public Student findStudent(int id) {
		
		return sdao.find(id);
	}

}
