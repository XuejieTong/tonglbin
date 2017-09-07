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
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tonglbin.commontools.JsonUtil;
import org.tonglbin.entity.xsd.TbUser;
import org.tonglbin.services.user.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request) throws Exception {

		logger.info("info ");
		logger.error("error");
		logger.warn("warn");
		logger.debug("debug");
		logger.fatal("fatal");
		return "/index";
	}

	@ResponseBody
	@RequestMapping("/getUserById")
	public String getUserById(int id) throws Exception {

		String oRes =  "Î´·µ»ØÊý¾Ý";
		UserServicesImplStub userServStub = new UserServicesImplStub();
		GetUser getUser = new GetUser();
		getUser.setId(id);
		TbUser user = new TbUser();
		user = userServStub.getUser(getUser).get_return();
		if(user!=null) {
			 oRes = user.getUsername();//JsonUtil.objectToJsonStr(user);
		}

		return oRes;
	}

}