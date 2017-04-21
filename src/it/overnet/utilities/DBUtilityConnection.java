package it.overnet.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtilityConnection {

	public static Connection getDBConnection() throws Exception {

		Connection dbConnection = null; // oggetto istanzia una sessione di connessione

		try {

			Class.forName(Constant.DB_DRIVER); // class è la classe base di java

		} catch (ClassNotFoundException e) {
			throw new Exception(e.getMessage());
		}

		try {

			dbConnection = DriverManager.getConnection(Constant.DB_CONNECTION, Constant.DB_USERNAME,
					Constant.DB_PASSWORD); // configuro collegamento database
			return dbConnection;

		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
}
