package com.spring.test1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean(args[0]);
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeDown();
//		tv.volumeUp();
//		1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
//		2. Spring 컨테이너로 부터 필요한 객체르 요청한다.
		TV tv = (TV)factory.getBean("tv");
//		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeDown();
		tv.volumeUp();
		
//		3. Spring 컨테이너를 종료한다.
		factory.close();
	}

}
