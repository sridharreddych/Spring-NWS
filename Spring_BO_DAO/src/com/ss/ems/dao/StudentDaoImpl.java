package com.ss.ems.dao;

import java.util.Set;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ss.ems.model.Student;

public class StudentDaoImpl implements StudentDaoInterface {

	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	@Override
	public int save(Student st) {
		int i = (Integer)ht.save(st);
		return i;
	}

	@Override
	public Student find(int id) {
		
		return (Student)ht.get(Student.class, id);
	}

}
