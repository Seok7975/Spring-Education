package polymorphism;

public class LgTV implements TV{
	public void powerOn() {
		System.out.println("LGTV---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LGTV---���� ����.");
	}
	public void volumeUp() {
		System.out.println("LGTV---�Ҹ� �ø���.");
	}
	public void volumeDown() {
		System.out.println("LGTV---�Ҹ� ������.");
	}
}
