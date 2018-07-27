package business;

import dao.StudentDao;
import model.Student;

public class StudentBoImpl implements StudentBo {

	private StudentDao dao;
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	public int createStudent(Student std) throws Exception {
		// TODO Auto-generated method stub
		return dao.save(std);
	}

	@Override
	public boolean updateStudent(Student std) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(Student std) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
