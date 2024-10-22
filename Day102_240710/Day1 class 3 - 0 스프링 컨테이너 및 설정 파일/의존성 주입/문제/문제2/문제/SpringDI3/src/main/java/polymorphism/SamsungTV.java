package polymorphism;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV ��ü ����");
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price =price;
	}
	
	public void initMethod(){
		System.out.println("===> initMethod");
	}
	public void destroyMethod(){
		System.out.println("===> destroyMethod");
	}
	public void powerOn(){
		System.out.println("SamsungTV --- ���� �Ҵ�. (���� : " + price + ")");
	}
	public void powerOff(){
		System.out.println("SamsungTV --- ���� ����.");
	}
	public void volumeUp(){
		speaker.volumeUp();
	}
	public void volumeDown(){
		speaker.volumeDown();
	}
}