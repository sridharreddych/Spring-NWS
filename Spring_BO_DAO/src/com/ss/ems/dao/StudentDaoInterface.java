package com.ss.ems.dao;

import com.ss.ems.model.Student;

public interface StudentDaoInterface {

	public int save(Student st);
	public Student find(int id);
	
}
