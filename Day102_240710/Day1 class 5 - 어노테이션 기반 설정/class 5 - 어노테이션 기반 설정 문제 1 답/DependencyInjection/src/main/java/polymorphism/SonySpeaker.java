package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker(){
		System.out.println("===> SonySpeaker 객체 생성");
	}
	
	 @Override
	public void volumeUp(){
		 System.out.println("SonySpeaker---소리 올린다.");
	 }

	 @Override
	public void volumeDown(){
		 System.out.println("SonySpeaker---소리 내린다.");
	 }
}

/*
	Speaker 인터페이스 만들기
	단축키 Alt + Shift + T, E
*/