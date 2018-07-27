package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import model.Student;

public class StudentDaoImplJDBC implements StudentDao {

	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public int save(Student std) throws Exception {
		
		Connection con = ds.getConnection();
		PreparedStatement ps= con.prepareStatement("insert into Student values(?,?,?,?)");
		ps.setInt(1, std.getId());
		ps.setString(2, std.getName());
		ps.setString(3, std.getEmail());
		ps.setString(4, std.getAddress());
		
		int i = ps.executeUpdate();
		con.close();
		return i;
	}

	@Override
	public boolean update(Student std) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student std) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findByPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByAddress(String address) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
