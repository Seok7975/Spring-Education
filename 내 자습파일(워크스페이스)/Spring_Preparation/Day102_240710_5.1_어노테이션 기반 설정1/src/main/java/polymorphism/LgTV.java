package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	public void powerOn() {
		System.out.println("LGTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("LGTV---전원 끈다.");
	}
	public void volumeUp() {
		System.out.println("LGTV---소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("LGTV---소리 내린다.");
	}
}

/*
스프링 설정 파일에서 빈을 생성하든, @Component를 쓰던, 두 설정 모두 해당 클래스에 기본 생성자가 있어야만 컨테어니가
객체를 생성할 수 있다. 이렇게 설정했다면 클래스의 객체가 메모리에 생성되는 것은 문제 없다. 그러나 클라이언트 프로그램에서
LgTV 객체를 요청할 수는 없다. 클라이언트가 생성한 객체를 요청하려면, 요청할 때 사용할 아이디나 이름이 반드시
설정되어 있어야 한다.

XML 설정
<bean id="tv" class="polymorphism.LgTV"></bean>

Annotation 설정
@Component("tv")
public class LgTV implements TV{
	public LgTV(){
		System.out.println("===> LgTV 객체 생성");
	}
}

참고 : id나 name 속성 미지정 시 이름규칙
스프링 컨테이너가 클래스 객체를 생성할 때, id나 name 속성을 지정하지 않았다면, 컨테이너가 자동으로 이름을
설정해준다. 이때 이름 규칙은 클래스 이름의 첫글자를 소문자로 변경하기만 하면 된다. 따라서 id나 name 속성이
설정되지 않은 경우, LgTV 객체를 요청하려면 lgTV라는 이름을 사용하면 된다.
*/