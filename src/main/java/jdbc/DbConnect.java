package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

// The class attempts to acquire a connection with the database
class DbConnect {
	
	public static void main(String[] args) {
		// URL points to JDBC protocol: mysql subprotocol;
		// localhost is the address of the server where we installed our
		// DBMS (i.e. on local machine) and 3306 is the port on which
		// we need to contact our DBMS
		String url = "jdbc:postgresql://localhost:5432/";
		// we are connecting to the addressBook database we created earlier
		String database = "addressBook";
		// we login as "root" user with password "mysql123"
		String userName = "postgres";
		String password = "postgres";
		try (Connection connection = DriverManager.getConnection
				(url + database, userName, password)) {
			System.out.println("Database connection: Successful");
		} catch (Exception e) {
			System.out.println("Database connection: Failed");
			e.printStackTrace();
		}
	}
	
}