package com.study.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.cj.Driver";
//	MySQL Driver 6.0 "com.mysql.cj.jdbc.Driver";

//	private static final String URL = "jdbc:mysql://127.0.0.1:3306/springMVC?useSSL=no";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/springMVC?useSSL=fasle&serverTimezone=Asia/Seoul";
//	MySQL 6.1 "jdbc:mysql://127.0.0.1:3306/springMVC?useSSL=fasle&serverTimezone=Asia/Seoul";

	// mysql ���̵�
	private static final String USER = "legacy";
	// mysql ��й���
	private static final String PW = "legacy";

	@Test
	public void testConnection() throws Exception {

		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}
