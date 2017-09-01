package org.tonglbin.dao.user;

import java.util.List;
import org.tonglbin.entity.User;

public interface IUserDao {
	public User getUser(String id);
	
	public List<User> getAllUser();
	
	public void addUser(User user);
	
	public boolean delUser(String id);
	
	public boolean updateUser(User user);
}
