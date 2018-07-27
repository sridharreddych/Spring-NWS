package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test2   {
	
	
	public void init(){
		System.out.println("Test2 Init ........");
	}
	
	public void destroy() {
		System.out.println("Test2 Destroy .......");
	}
}
