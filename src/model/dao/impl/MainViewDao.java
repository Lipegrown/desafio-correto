package model.dao.impl;

import java.sql.Connection;
import java.util.List;


import model.dao.MainViewDAO;
import model.entities.Mainview;

public class MainViewDao implements MainViewDAO {
	
	
	private Connection conn;
	
	public  MainViewDao(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Mainview obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Mainview obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer jogo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mainview findById(Integer jogo) {
		return null;
		
	}

	@Override
	public List<Mainview> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
