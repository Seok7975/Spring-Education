package polymorphism;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV ��ü ����");
	}

	public void initMethod(){
		System.out.println("===> initMethod");
	}
	public void destroyMethod(){
		System.out.println("===> destroyMethod");
	}
	public void powerOn(){
		System.out.println("SamsungTV --- ���� �Ҵ�.");
	}
	public void powerOff(){
		System.out.println("SamsungTV --- ���� ����.");
	}
	public void volumeUp(){
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown(){
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}