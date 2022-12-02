package org.tnsindia.springbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	private String driver;
	private String URL;
	private String usrename;
	private String password;
	
	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		
		Class.forName(driver);
		Connection c=DriverManager.getConnection(URL, usrename, password);
		
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM m25.student");
		
		while(r.next())
		{
			int Roll_No=r.getInt(1);
			String Name=r.getString(2);
			System.out.println("The Below Table is foe Stident: ");
			System.out.printf("Roll No.: "+Roll_No, "Student Name: "+Name);
		}
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public void setUsrename(String usrename) {
		this.usrename = usrename;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
