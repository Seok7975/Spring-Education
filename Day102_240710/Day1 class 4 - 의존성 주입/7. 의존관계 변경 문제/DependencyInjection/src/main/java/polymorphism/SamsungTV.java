package polymorphism;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void initMethod(){
		System.out.println("===> initMethod");
	}
	public void destroyMethod(){
		System.out.println("===> destroyMethod");
	}
	public void powerOn(){
		System.out.println("SamsungTV --- 전원 켠다. (가격 : " + price + ")");
	}
	public void powerOff(){
		System.out.println("SamsungTV --- 전원 끈다.");
	}
	public void volumeUp(){
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown(){
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}