package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// 1. 스프링 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. 스프링 컨테이너로부터 필요한 객체를 요청한다.
		TV tv1 = (TV) factory.getBean("tv");
		TV tv2 = (TV) factory.getBean("tv");
		TV tv3 = (TV) factory.getBean("tv");

		// 3. 스프링 컨테이너를 종료한다.
		factory.close();
	}
}

/*
스프링 컨테이너는 컨테이너가 생성한 bean을 어느 범위에서 사용할 수 있는지를 지정할 수 있는데, 이때 scope 속성을
사용한다.
scope 속성값은 기본이 싱글톤이다. 이는 해당 bean이 스프링 컨테이너에 의해 단 하나만 생성되어 운용되돌고 한다.
<bean id="tv" class="polymorphism.SamsungTV" scope="singleton" />

<bean>의 scope 속성을 "prototype"으로 지정할 수 있는데, 이렇게 지정하면 스프링 컨테이너는
해당 <bean>이 요청될 때마다 매번 새로운 객체를 생성하여 반환한다.
<bean id="tv" class="polymorphism.SamsungTV" scope="prototype" />
*/