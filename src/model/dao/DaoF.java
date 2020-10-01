package model.dao;

import db.DB;
import model.dao.impl.MainViewDao;

public class DaoF {

	public static MainViewDAO crateMainViewDao() {
		return new MainViewDao(DB.getConnection());
	}
	
}
