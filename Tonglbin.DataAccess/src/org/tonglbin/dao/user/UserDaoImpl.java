package org.tonglbin.dao.user;

import java.util.List;
import org.hibernate.Query;
import org.tonglbin.entity.TbUser;
import org.tonglbin.dao.utilities.DaoCommon;

public class UserDaoImpl extends DaoCommon implements IUserDao {

	@Override
	public TbUser getUser(int id) {
		TbUser user = null;
		String hql = "from TbUser u where u.userid=?";
		Object obj = sessionFactory.openSession().createQuery(hql).setInteger(0, id).uniqueResult();
		if (obj != null) {
			user = (TbUser) obj;
		}
		return user;
	}

	@Override
	public List<TbUser> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(TbUser user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(TbUser user) {
		// TODO Auto-generated method stub
		return false;
	}

}
