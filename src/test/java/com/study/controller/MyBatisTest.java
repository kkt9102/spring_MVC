package com.study.controller;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//현재 테스트 코드를 실행할 때 스프링이 로딩되도록 하는 부분
@RunWith(SpringJUnit4ClassRunner.class)
//설정한 속성 경로에 xml 파일을 이용해서 스프링을 로딩함
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-ING/spring**/root-context.xml"})
public class MyBatisTest {

	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		System.out.println(sqlFactory);
	}
	
	@Test
	public void testSession() throws Exception{
		try(SqlSession session = sqlFactory.openSession()) {
			System.out.println(session);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
