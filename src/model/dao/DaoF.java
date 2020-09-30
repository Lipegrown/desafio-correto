package model.dao;

import model.dao.impl.MainViewDao;

public class DaoF {

	public static MainViewDAO crateMainViewDao() {
		return new MainViewDao(null);
	}
	
}
