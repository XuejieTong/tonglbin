package org.tonglbin.business.utilities;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseBusiness {
	protected  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/tonglbin/config/spring/applicationContext.xml");
}
