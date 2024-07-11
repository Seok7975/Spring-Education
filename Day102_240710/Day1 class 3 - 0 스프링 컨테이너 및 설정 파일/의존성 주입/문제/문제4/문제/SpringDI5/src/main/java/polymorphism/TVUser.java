package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {


		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();	
		
		factory.close();
	}
}