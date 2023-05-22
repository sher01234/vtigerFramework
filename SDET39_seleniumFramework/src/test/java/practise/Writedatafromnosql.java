package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Writedatafromnosql {

	public static void main(String[] args) throws Throwable {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachers_info","root","root");
Statement stat = conn.createStatement();
String query="insert into teachers(first_name,last_name,address)value('kavita','maran','india')";
int result = stat.executeUpdate(query);
if(result==1) {
	System.out.println("user is created");
}
else {
	System.out.println("user is not created");
}
	}

}


	


