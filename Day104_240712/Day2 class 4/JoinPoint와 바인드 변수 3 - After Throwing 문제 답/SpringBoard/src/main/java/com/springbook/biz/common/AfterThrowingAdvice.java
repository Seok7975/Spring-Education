package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		
		System.out.println("[예외 처리] " + method + "() 메소드 수행 중 발생된 예외 메시지 : " + exceptObj.getMessage());
	}
	
}


/*
	After Throwing 어드바이스
	After Throwing은 비즈니스 메소드가 수행되다가 예외가 발생할 때 동작하는 어드바이스이다.
	따라서 어떤 메소드에서 어떤 예외가 발생했는지를 알아야 한다. 그래야 발생한 예외의 종류에 따라 정확한 예외 처리를
	구현할 수 있을 것이다.
	
	exceptionLog() 메소드는 예외가 발생한 메소드 정보를 알아내기 위해서 JoinPoint 객체를 매개변수로 받는다. 그리고
	After Returning처럼 비즈니스 메소드에서 발생한 예외 객체를 exceptObj라는 바인드 변수를 통해 받는다. 바인드 변수는
	모든 예외 객체를 바인드할 수 있도록 예외 클래스의 최상위 타입인 Exception으로 선언한다.
	
	// throwing="exceptObj"

	<bean id="afterThrowing" class="com.springbook.biz.common.AfterThrowingAdvice"></bean>
 	<aop:config>
		<aop:pointcut id="allPointcut" expression ="execution(* com.springbook.biz..*Impl.*(..))" />
		<aop:pointcut id="getPointcut" expression ="execution(* com.springbook.biz..*Impl.get*(..))" />
		<aop:aspect ref="afterThrowing">
			<aop:after-throwing pointcut-ref="allPointcut" method="exceptionLog" throwing="exceptObj"/>
		</aop:aspect>
	</aop:config>	
	
	위의 설정은 비즈니스 메소드에서 발생한 예외 객체를 exceptObj라는 바인드 변수에 바인드하라는 설정이다. throwing 속성은
	<aop:after-throwing> 엘리먼트에서만 사용할 수 있는 속성이며, 속성값은 어드바이스 메소드 매개변수로 선언된 바인드 변수 이름과
	같아야 한다.
*/