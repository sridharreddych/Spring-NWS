package com.ss.ems.bo;

import com.ss.ems.model.Student;

public interface StudentBoInterface {

	public int createStudent(Student st);
	public Student findStudent(int id);
}
