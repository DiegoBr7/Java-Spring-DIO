package br.com.dio;


import br.com.dio.persistence.migration.MigrationStrategy;
import br.com.dio.ui.MainMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static br.com.dio.persistence.config.ConnectionConfig.getConnection;

public class BoardApplication {

	public static void main(String[] args) throws SQLException {
		try(	var connection = getConnection()) {
		new MigrationStrategy(connection).executeMigration();
		}

		new MainMenu().execute();

    }

}