package org.tonglbin.business.role;

import org.tonglbin.business.utilities.BaseBusiness;
import org.tonglbin.dao.role.RolesDaoImpl;
import org.tonglbin.entity.TbRole;

public class RoleBusinessImpl extends BaseBusiness implements IRoleBusiness {

	@Override
	public TbRole getRole(int id) {
		
		// 配置文件中的id属性
		RolesDaoImpl rolesDao = (RolesDaoImpl) context.getBean("rolesDao");
		TbRole roles = rolesDao.getRole(id);
		context.close();

		return roles;
	}
}
