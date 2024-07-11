package polymorphism;

public class TVUser {

	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}
}

/*
 * SamsungTV와 LgTV는 메소드 이름이 다르므로 TVUser 코드 대부분을 수정해야 TV를 교체할 수 있다. 현재 상태에서는 두 TV 클래스가 같은 메소드를
 * 가지게끔 강제할 어떤 수단도 없다. 만약 TVUser와 같은 클라이언트 프로그램이 하나가 아니라 여러 개라면 유지보수는 더욱더 힘들 것이며, 
 * TV 교체를 결정하기가 쉽지 않을 것이다.
 */
