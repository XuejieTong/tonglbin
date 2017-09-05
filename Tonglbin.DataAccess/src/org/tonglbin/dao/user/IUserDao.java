package org.tonglbin.dao.user;

import java.util.List;
import org.tonglbin.entity.TbUser;

public interface IUserDao {
	public TbUser getUser(int id);
	
	public List<TbUser> getAllUser();
	
	public void addUser(TbUser user);
	
	public boolean delUser(String id);
	
	public boolean updateUser(TbUser user);
}
