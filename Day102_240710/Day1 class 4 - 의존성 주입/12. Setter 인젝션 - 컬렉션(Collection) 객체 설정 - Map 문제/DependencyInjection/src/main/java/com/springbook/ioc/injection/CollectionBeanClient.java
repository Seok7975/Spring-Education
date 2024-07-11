package com.springbook.ioc.injection;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Map<String, String> addressList = bean.getAddressList();
		
		for(String key : addressList.keySet() ){
			String value = addressList.get(key);
			System.out.println( key +" : "+ value );
		}
		factory.close();
	}
}