package org.tonglbin.web;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tonglbin.commontools.JsonUtil;
import org.tonglbin.entity.xsd.User;
import org.tonglbin.services.user.*;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request) throws Exception {

		return "/index";
	}

	@ResponseBody
	@RequestMapping("/getUserById")
	public String getUserById(String id) throws Exception {

		UserServicesImplStub userServStub = new UserServicesImplStub();
		GetUser getUser = new GetUser();
		getUser.setId(id);
		User user = new User();
		user = userServStub.getUser(getUser).get_return();
		String oRes = JsonUtil.objectToJsonStr(user);
		return oRes;
	}

}