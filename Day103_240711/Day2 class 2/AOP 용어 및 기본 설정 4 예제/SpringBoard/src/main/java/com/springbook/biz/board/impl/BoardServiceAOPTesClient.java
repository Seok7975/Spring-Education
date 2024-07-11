package com.springbook.biz.board.impl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceAOPTesClient {

	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
//		BoardServiceAOPTest aopTest = new BoardServiceAOPTestImpl();
		BoardServiceAOPTest aopTest = (BoardServiceAOPTest) container.getBean("aopTest");
		aopTest.hi();
		aopTest.good();
		aopTest.nice();
		aopTest.add(10, 20);
		aopTest.morninghi();
		container.close();
	}
}