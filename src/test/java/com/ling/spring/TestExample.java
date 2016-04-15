package com.ling.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.ling.spring.test.OneInterface;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestExample extends UnitTestBase {

	public TestExample() {
		super("classpath*:spring-ioc.xml");
	}

	@Test
	public void testOneInterface(){
		OneInterface oneInterface = this.getBean("oneInterface");
		oneInterface.sayHello("LiDOngHai");
	}
	

}
