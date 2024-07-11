package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class LgTV implements TV {
	
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV ������");
	}
	public void powerOn(){
		System.out.println("LgTV --- ���� �Ҵ�.");
	}
	public void powerOff(){
		System.out.println("LgTV --- ���� ����.");
	}
	public void volumeUp(){
		speaker.volumeUp();
	}
	public void volumeDown(){
		speaker.volumeDown();
	}
}