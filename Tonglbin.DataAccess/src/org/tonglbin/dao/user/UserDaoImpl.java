package org.tonglbin.dao.user;

import java.util.List;
import org.hibernate.Query;
import org.tonglbin.entity.User;
import org.tonglbin.dao.utilities.DaoCommon;

public class UserDaoImpl extends DaoCommon implements IUserDao {
	
	@Override
	public User getUser(String id) {
		String hql = "from User u where u.id=?";
		Query query = sessionFactory.openSession().createQuery(hql);
		query.setString(0, id);
		return (User) query.uniqueResult();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
