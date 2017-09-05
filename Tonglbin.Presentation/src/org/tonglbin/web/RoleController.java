package org.tonglbin.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tonglbin.commontools.JsonUtil;
import org.tonglbin.entity.xsd.TbRole;
import org.tonglbin.services.role.GetRole;
import org.tonglbin.services.role.RoleServicesImplStub;

@Controller
@RequestMapping(value = "/role")
public class RoleController {

	@RequestMapping("/getRole")
	public String getAllRole(HttpServletRequest request) throws Exception {

		return "/index";
	}

	@ResponseBody
	@RequestMapping("/getRoleById")
	public String getRoleById(int id) throws Exception {

		String oRes = "Î´·µ»ØÊý¾Ý";
		RoleServicesImplStub roleServStub = new RoleServicesImplStub();
		GetRole getRole = new GetRole();
		getRole.setId(id);
		TbRole role = new TbRole();
		role = roleServStub.getRole(getRole).get_return();
		if (role != null) {
			oRes = JsonUtil.objectToJsonStr(role);
		}

		return oRes;
	}
}
