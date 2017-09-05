package org.tonglbin.services.role;

import org.tonglbin.business.role.RoleBusinessImpl;
import org.tonglbin.entity.TbRole;
import org.springframework.stereotype.Service;

@Service("RoleService")
public class RoleServicesImpl implements IRoleServices {

	@Override
	public TbRole getRole(int id) {
		RoleBusinessImpl roleBusiness = new RoleBusinessImpl();
		return roleBusiness.getRole(id);
	}

}
