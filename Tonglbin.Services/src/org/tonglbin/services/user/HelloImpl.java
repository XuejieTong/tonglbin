package org.tonglbin.services.user;

import org.springframework.stereotype.Service;
import org.tonglbin.business.user.UserBusinessImpl;
import org.tonglbin.entity.TbUser;

@Service("HelloService")
public class HelloImpl implements IHello {

	@Override
	public String sayHello(int id) {
		String oRes = "Hello,Everyone!";
		UserBusinessImpl userBusiness = new UserBusinessImpl();
		TbUser user = userBusiness.getUser(id);
		if (user != null) {
			oRes = "Hello," + user.getUsername();
		}
		return oRes;
	}

}
