package model.dao;

import java.util.List;

import model.entities.Mainview;

public interface MainViewDAO {

	void insert(Mainview obj);
	void update(Mainview obj);
	void deleteById(Integer jogo);
	Mainview findById(Integer jogo);
	List<Mainview> findAll();
	
}
