# jUnit 기본적인 사항
	- @Test : 테스트를 해야하는 내용을 메소드 안네 작성하고 메소드 위에 @Test 어노테이션을 추가하면 jUnit은 해당 메소드를 테스트용 코드로 인식하고 테스를 진행할 수 있다.
	- @Before : 모든 테스트작업에 앞서 준비되어야 하는 내용을 작성해서 메소드ㅔ에 추가하는 어노테이션. @Test 메소드의 실행전에 실행되기 떄문에  테스를 위한 준비 작업을 할 때 사용.
	- @After : 테스트 작업이 끝 난 후 자동으로 실행되는 메소드를 추가하는 어노테이션
	- org.junit.Assert.assertxxx : 테스트중에 발생되는 값을 확신하는 용도로 사용. 테스트 중간에 특정 값이나 상태를 예상하고 체크하는 용도로 사용
	
# MySQL 정보
	- MySQL버전이 5.6 이하일 경우 5.X버전만 이용이 가능하다.
	- JDK 1.7 이상 버전에서는 mysql 연결 테스트 진행 시 try-with 구문을 활용하여 finally 부분 없이 자동으로 close()가 호출되게 작성할 수 있다.  해당 조건으로 코드를 작성 하시 제약조건은 try 안의 () 에 선언되는 객체가 AutoCloseable이라는 인터페이스를 구현한 객체라야 한다는 점.
```java
	try (AutoCloseable `인터페이스를 구현한 타입의 변수`) {
	--작업
	} catch(Exception) {
	--예외처리
	}
```
[mysql테스트파일 보러가기](..\test\java\com\study\controller\MySQLConnectionTest.java)

# console 오류정보들
	- java.sql.SQLException: The connection property 'useSSL' only accepts values of the form: 'true', 'false', 'yes' or 'no'. The value 'fasle' is not in this set.
	  	- 말그대로 useSLL 에는 무조건 true 나 false 가 아닌 yes 나 no 로 작성해줘야 한다. 
	  	- 해결방법 : private static final String URL = "jdbc:mysql://127.0.0.1:3306/springMVC_ex?useSSL=fasle"; 해당 코드에서 fasle 를 no 로 바꿔준다.

	- java.sql.SQLException: Unable to load authentication plugin 'caching_sha2_password'.
	  	- 출처: https://kims0hee.tistory.com/11 [원더랜드]
	  	- ❌ALTER user root@localhost identified by '패스워드'    가 아닌 
	  	- ⭕️ALTER USER root@localhost IDENTIFIED WITH mysql_native_password BY '패스워드' 
	  	- 계정 권한을 허가하려하는 database를 선택한다.그러고 ALTER USER '아이디'@'localhost' IDENTIFIED WITH mysql_native_password BY '비밀번호'; 를 입력
	  
	- com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Unknown database 'springmvc_ex'
		- 말그대로다. 해당 DATABASE가 없다.
		
	- java.sql.SQLException: Unknown system variable 'query_cache_size'
		- mysql 버전문제
		
	- Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
		- AS-IS : private static final String DRIVER = "com.mysql.jdbc.Driver";
		- TO-BE : private static final String DRIVER = "com.mysql.jdbc.cj.Driver";