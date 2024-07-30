# Spring-Education

Day102_240710 
<br><br>

Day103_240711
<br><br>

Day107_240717<br>
1. 에러 노트<br>
org.springframework.jdbc가 계속 import가 안되었다. pom.xml에 Spring JDBC 종속성을 추가하고 프로젝트를 다시 빌드했더니 해결

		<dependency>
		    <groupId>org.springframework</groupId>
		    <artifactId>spring-jdbc</artifactId>
		    <version>${org.springframework-version}</version>
		</dependency>


톰캣 서버가 겹침현상이 발생해 이를 해결했어야 함.
-> <Context docBase 부분을 보면 여러개일 것이다. 여기서 실행할것만 남기고 삭제하였다.
그랬더니 해결 완료<br><br><br>

