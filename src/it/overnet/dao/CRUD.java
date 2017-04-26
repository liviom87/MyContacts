package it.overnet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.overnet.utilities.DBUtilityConnection;

public class CRUD {

	public static boolean createTable() throws Exception {

		Connection dbConnection = null;
		Statement statement = null;

		boolean check = false;

		String createTableSQL = "CREATE TABLE LISTA_CONTATTI"
			    + "(NOME VARCHAR(255)," + "COGNOME VARCHAR(255)," + "TELEFONO VARCHAR(50)," + "MAIL VARCHAR(255) UNIQUE)";

		try {
			dbConnection = DBUtilityConnection.getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(createTableSQL);

			statement.execute(createTableSQL);

			System.out.println("Tabella \"LISTA_CONTATTI\" creata con successo!");

		} catch (SQLException e) {

			System.err.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
		return check;
	}
}

