package com.min.edu;

import java.sql.SQLException;

public class ExceptionMain {

	public static void main(String[] args) {
		
		Conjunsion c = new Conjunsion();
		try {
			c.play();
		} catch (UserMakeException | SQLException e1) {
			e1.printStackTrace();
		}
	}
}
