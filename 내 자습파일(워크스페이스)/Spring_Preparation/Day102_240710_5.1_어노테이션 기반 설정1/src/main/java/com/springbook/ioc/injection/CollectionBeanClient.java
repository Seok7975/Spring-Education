package com.springbook.ioc.injection;

import java.util.Map.Entry;
import java.util.Properties; // key = value 형태의 데이터를 등록하고 사용할 때(둘다 문자열) <props> 엘리먼트를 사용하여 설정하며 사용!

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Properties addressList = bean.getAddressList();
		// for-each 루프를 사용할 때 Properties 객체는 직접적으로 반고할 수 없기 때문에, 객체의 키 or 값을 가져와서 반복해야함
		// Properties 객체에서 키를 반복하려면 keySet() 메서드를 사용하고, 
		// 값을 반복하려면 values() 메서드를 사용할 수 있습니다. 
		// 여기서는 키와 값을 모두 출력하기 위해 entrySet() 메서드를 사용하는 것이 좋다.
		for (Entry<Object, Object> entry : addressList.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		factory.close();		
	}
	
}
