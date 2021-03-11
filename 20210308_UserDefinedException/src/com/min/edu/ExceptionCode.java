package com.min.edu;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionCode {

	public int calArithmatic(int a, int b) throws UserMakeException, SQLException {
		int result = 0;

		try {
			result = a / b;
		} catch (Exception e) {
			throw new UserMakeException();
		}
		
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		DriverManager.getConnection("");

		return result;
	}

}
