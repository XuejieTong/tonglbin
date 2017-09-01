package org.tonglbin.services.user;

import org.tonglbin.business.user.UserBusinessImpl;
import org.tonglbin.entity.User;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServicesImpl implements IUserServices {

	@Override
	public User getUser(String id) {
		UserBusinessImpl userBusiness = new UserBusinessImpl();
		return userBusiness.getUser(id);
	}

}
