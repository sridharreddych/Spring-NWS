package beans;

import java.sql.Connection;
import java.util.Date;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class Test {

	public static void main(String[] args) {
		
		BasicDataSource bds= new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("store");
		bds.setPassword("store_password");
		bds.setMaxActive(15);
		bds.setMaxIdle(5);
		bds.setMaxWait(1000*5); //long milli seconds we should pass, up to 5 secs user need to wait. after 5 sec connection pool also need to return some exception.
		
		System.out.println("Connection pool");
		Date d1 = new Date();
		
		for(int i=0;i<200000;i++)
		{
			
			try {
				Connection con = bds.getConnection();
				System.out.println(con+":"+i);
				con.close();
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		Date d2 = new Date();
		System.out.println("start time:"+d1);
		System.out.println("end time:"+d2);
	}

}
