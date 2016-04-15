package com.ling.spring.test;

public class OneInterfaceImpl implements OneInterface {

	@Override
	public void sayHello(String str) {
		System.out.println("this is Interface Say:"+str);
	}
}
