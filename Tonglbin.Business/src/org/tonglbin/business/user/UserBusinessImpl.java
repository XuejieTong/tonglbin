package org.tonglbin.business.user;

import org.tonglbin.business.utilities.BaseBusiness;
import org.tonglbin.dao.user.UserDaoImpl;
import org.tonglbin.entity.TbUser;

public class UserBusinessImpl extends BaseBusiness implements IUserBusiness {

	@Override
	public TbUser getUser(int id) {
		
		// �����ļ��е�id����
		UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");
		TbUser user = userDao.getUser(id);
		context.close();

		return user;
	}
}
