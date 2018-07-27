package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Student;

public class StudentDaoImplHT implements StudentDaoInterface {

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
	public boolean update(Student st) {
		ht.update(st);
		return true;
	}

	@Override
	public boolean delete(Student st) {
		ht.delete(st);
		return true;
	}

	@Override
	public Student findbyPk(int pk) {
		Student std = (Student)ht.get(Student.class,pk);
		return std;
	}

	@Override
	public List<Student> findAllUsingHQL() {
		List<Student> list = ht.find("from Student");
		return list;
	}
	
	@Override
	public List<Student> findAllUsingCriteria() {
		DetachedCriteria dc= DetachedCriteria.forClass(Student.class);
		/*dc.setProjection(projection);
		dc.add(criterion);
*/
		List<Student> list = ht.findByCriteria(dc);
		return list;
	}

}
