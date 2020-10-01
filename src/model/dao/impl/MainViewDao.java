package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.MainViewDAO;
import model.entities.Mainview;

public class MainViewDao implements MainViewDAO {

	private Connection conn;

	public MainViewDao(Connection conn) {
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
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT *FROM maria " + "WHERE maria.jogo = ?");

			st.setInt(1, jogo);
			rs = st.executeQuery();
			if (rs.next()) {

			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}

	@Override
	public List<Mainview> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
