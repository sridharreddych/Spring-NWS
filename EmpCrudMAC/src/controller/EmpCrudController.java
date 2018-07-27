package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmpCrudController extends MultiActionController {
	
	public ModelAndView empsave(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		
	  Class.forName("oracle.jdbc.OracleDriver");
	    
	  Connection con=   DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "store", "store_password");
	    ResultSet rs= con.createStatement().executeQuery("select max(id) from emp");
			    int maxid=0;
			    if(rs.next())
			    {
			    	maxid=rs.getInt(1);
			    	maxid++;
			    }
			    
	    PreparedStatement ps =con.prepareStatement("insert into emp values(?,?,?,?)");
	    ps.setInt(1,maxid);
	    ps.setString(2,name);
	    ps.setString(3,email);
	    ps.setString(4,address);
	    
	    int i = ps.executeUpdate();
	    con.close();
	    ModelAndView mav = null;
	    
	    if(i!=0)
	    mav = new ModelAndView("success");
	    else
	    mav = new ModelAndView("fail");
	    return mav;
	}
	
	public ModelAndView empupdate(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		
		Class.forName("oracle.jdbc.OracleDriver");
	    
	    Connection con=   DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "store", "store_password");
		  
		
		 PreparedStatement ps =con.prepareStatement("update emp set name=?,email=?,address=? where id=?");
		    ps.setString(1,name);
		    ps.setString(2,email);
		    ps.setString(3,address);
		    ps.setInt(4,id);
		    
		    int i = ps.executeUpdate();
		    con.close(); 
		    
		    ModelAndView mav = null;
		    
		    if(i!=0)
		    mav = new ModelAndView("success");
		    else
		    mav = new ModelAndView("fail");
		    return mav;
	}

	
}
