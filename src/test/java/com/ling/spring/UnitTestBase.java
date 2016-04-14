package com.ling.spring;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {
	
	private ClassPathXmlApplicationContext context;
	private String springXmlPath;
	
	public UnitTestBase() {
	}

	public UnitTestBase(String springXmlPath) {
		super();
		this.springXmlPath = springXmlPath;
	}
	
	@Before
	public void before(){
		if(StringUtils.isEmpty(springXmlPath)){
			springXmlPath = "classpath*:spring-*.xml";
		}
		try{
			context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
			context.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@After
	public void after(){
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String id){
		return (T) context.getBean(id);
	}
	
	protected <T extends Object> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}
	

}
