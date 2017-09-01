package org.tonglbin.dao.utilities;

import org.hibernate.SessionFactory;

public class DaoCommon {
	
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
