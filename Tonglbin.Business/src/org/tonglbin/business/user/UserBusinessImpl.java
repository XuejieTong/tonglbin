package org.tonglbin.business.user;

import org.tonglbin.business.utilities.BaseBusiness;
import org.tonglbin.dao.user.UserDaoImpl;
import org.tonglbin.entity.TbUser;

public class UserBusinessImpl extends BaseBusiness implements IUserBusiness {

	@Override
	public TbUser getUser(int id) {
		
		// 配置文件中的id属性
		UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");
		TbUser user = userDao.getUser(id);
		context.close();

		return user;
	}
}
