package org.tonglbin.dao.role;

import org.tonglbin.dao.role.IRolesDao;
import org.tonglbin.dao.utilities.DaoCommon;
import org.tonglbin.entity.TbRole;

public class RolesDaoImpl extends DaoCommon implements IRolesDao {
	@Override
	public TbRole getRole(int id) {
		TbRole role = null;
		String hql = "from TbRole r where r.roleid=?";
		Object obj = sessionFactory.openSession().createQuery(hql).setInteger(0, id).uniqueResult();
		if (obj != null) {
			role = (TbRole) obj;
		}
		return role;
	}
}
