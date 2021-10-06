# spring MVC 작동원리

<div>
	
</div>

# 1. Spring Project에서 root-context.xml 파일의 수정
	- 프로젝트 내에 src/main/webapp/WEB-INF/spring/root-context.xml 파일은 STS가 스프링 프로젝트를 생성할 때 만들어주는 가장 중요한 파일! 이 파일은 스프링과 관련된 설정을 할 때 웹 자원과 관련되지 않은 모든 자원의 설정을 위해 존재함!
	- root-context.xml파일에서 스프링 프레임워크에 다양한 설정을 하기 위해서느 STS상에서 Namespaces 탭을 이용해서 사용 가능한 XML태그의 폭을 넙혀줘야한다. (XML문서 내에 어떤 태그나 속성을 적을 수 있는 지 명시해주는 역할)

---

# 2. MySQL과 연결을 담당하는 DataSource 설정하기
	- 
	
---

# SqlSessionFactory 객체 설정
	- MyBatis와 스프링 연도에서의 핵심은 Connection을 생성하고, 처리하는 SqlSessionFactory의 존재이다. SqlSessionFactory는 Databases와의 연골과 SQL의 실해에 대한 모든것을 가진 객체!  추가된 Bean객체의 속성값은 'org.mybatis.spring.xxx' 클래스이다. 이 클래서는 MyBatis-Spring 모듈을 다운받아야 사용할 수 있다.
	
	- mybatis-config.xml 파일의 설정(중요함)
	- mybatis-config.xml 파일을 쉽게 파악할 수 있는 위치 ("src/main/resources") 에 생성해준다.
	- 그 후 해당 파일에 <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD config 3.0//EN" "http://mybaris.org/dtd/mybatis-3-config.dtd">
		
		<configuration>
		
		</configuration>
		을 작성해준다.
	- 그 후 mybatis-config.xml이 스프링이 동작할 때 같이 동작할 수 있도록 root-context.xml을 설정해준다.
	
---

# MyBatis 연결 테스트
	- 
	- 만약 SqlSessionFactoryBean의 설정에 문제가 있다면 이번 테스트에서 문제가 발생함!
	
---

# Model2 구조 (MVC 패턴)
	- Model : 데이터 혹은 데이터를 처리하는 영역을 의미
	- View : 결과 화면을 만들어내는데 사용되는 자원을 의미
	- Controller : 웹상의 요청을 처리하는 존재로 View와 Model 사이의 중간 통신역할을 의미