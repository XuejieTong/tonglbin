package org.tonglbin.business.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tonglbin.dao.user.UserDaoImpl;
import org.tonglbin.entity.User;

public class UserBusinessImpl implements IUserBusiness {

	@Override
	public User getUser(String id) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/tonglbin/config/spring/applicationContext.xml");	
		// �����ļ��е�id����
		UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");
		User user = userDao.getUser(id);
		context.close();

		return user;
	}
}
