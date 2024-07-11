package com.springbook.biz.board.impl;

import org.springframework.stereotype.Service;

@Service("aopTest")
public class BoardServiceAOPTestImpl implements BoardServiceAOPTest {	
	
	
	public BoardServiceAOPTestImpl() {
	}
	@Override
	public void hi() {
		System.out.println("hi");
	}
	@Override
	public int good() {
		System.out.println("good");
		return 100;
	}
	@Override
	public String nice() {
		System.out.println("nice");
		return "nice";
	}
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	@Override
	public void morninghi() {
		System.out.println("morninghi");
	}
}
