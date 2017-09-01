package org.tonglbin.services.user;

import org.springframework.stereotype.Service;
import org.tonglbin.business.user.UserBusinessImpl;
import org.tonglbin.entity.User;

@Service("HelloService")
public class HelloImpl implements IHello {

	@Override
	public String sayHello(String id) {
		String oRes = "Hello,Everyone!";
		if (id != null && id != "") {
			UserBusinessImpl userBusiness = new UserBusinessImpl();
			User user = userBusiness.getUser(id);
			if (user != null) {
				oRes = "Hello," + user.getUserName();
			}
		}

		return oRes;
	}

}
