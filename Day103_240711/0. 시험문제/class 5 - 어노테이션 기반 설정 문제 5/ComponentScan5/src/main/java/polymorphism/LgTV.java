package polymorphism;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

public class LgTV implements TV {
	
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV 생성자");
	}
	public void powerOn(){
		System.out.println("LgTV --- 전원 켠다.");
	}
	public void powerOff(){
		System.out.println("LgTV --- 전원 끈다.");
	}
	public void volumeUp(){
		speaker.volumeUp();
	}
	public void volumeDown(){
		speaker.volumeDown();
	}
}