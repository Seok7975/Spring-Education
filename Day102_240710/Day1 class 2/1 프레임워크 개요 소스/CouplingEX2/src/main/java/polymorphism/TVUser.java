package polymorphism;

public class TVUser {

	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}

/*
 * TVUser 클래스는 TV 인터페이스 타입의 변수로 SamsungTV 객체를 참조하고 있다. 어렇게 묵시적 형변호(Promotion)을
 * 이용하여 객체를 참조하면 SamsungTV를 LgTV 객체로 변경할 때, 참조하는 객체만 변경하면 되므로 객체를 쉽게 교체할 수 있다.
 * 이렇게 다형성을 이용하면 TVUser와 같은 클라이언트 프로그램이 여러 개 있더라도 최소한의 수정으로 TV를 교체할 수 있다. 따라서
 * 유지보수는 좀 더 편해졌다고 볼 수 있다.
 */