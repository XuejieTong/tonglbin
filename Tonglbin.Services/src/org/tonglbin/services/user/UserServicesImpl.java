package org.tonglbin.services.user;

import org.tonglbin.business.user.UserBusinessImpl;
import org.tonglbin.entity.TbUser;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServicesImpl implements IUserServices {

	@Override
	public TbUser getUser(int id) {
		UserBusinessImpl userBusiness = new UserBusinessImpl();
		return userBusiness.getUser(id);
	}

}
