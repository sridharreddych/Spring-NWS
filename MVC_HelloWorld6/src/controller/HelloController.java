package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;


public class HelloController extends AbstractController {
	
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		
		Map m = new HashMap();
		m.put("msg","Hello... Using  Controller class name Mapping and Abstract controller... :)"+name);
		
		ModelAndView mav = new ModelAndView("success",m);
		
		return mav;
	}
	
	/*@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
				
	String name=req.getParameter("name");
	
	Map m = new HashMap();
	m.put("msg","Hello... Using  Controller class name Handdler Mapping... :)"+name);
	
	ModelAndView mav = new ModelAndView("success",m);
	
	return mav;
	}
*/
}
 