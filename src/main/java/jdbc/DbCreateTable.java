package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

class DbCreateTable {
	
	public static void main(String[] args) {
		try (Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement()) {
			// use CREATE TABLE SQL statement to
			// create table familyGroup
			statement.executeUpdate("CREATE TABLE familyGroup (id  SERIAL" +
					", nickName varchar(30)not null, primary key(id));");
			System.out.println("Table created successfully");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1);
		}
	}
	
}