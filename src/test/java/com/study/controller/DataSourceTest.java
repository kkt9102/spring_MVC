package com.study.controller;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 현재 테스트 코드를 실행할 때 스프링이 로딩되도록 하는 부분
@RunWith(SpringJUnit4ClassRunner.class)
// 설정한 속성 경로에 xml 파일을 이용해서 스프링을 로딩함
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-ING/spring**/root-context.xml"})

public class DataSourceTest {
	// 스프링이 생성새서 주입함.
	@Inject
	private DataSource ds;
	
	@Test
	public void testConection() throws Exception {
		try(Connection con = ds.getConnection()) {
			System.out.println(con);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
