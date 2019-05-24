package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import entity.Map;

public class DAOMap extends DAOEntity<Map> {

	public DAOMap(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Map entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Map entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Map entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResultSet findLoadMap(int id) throws SQLException {
		System.out.println("test resultset");
		final String sql = "{CALL GetMap()}";
		final CallableStatement call = this.getConnection().prepareCall(sql);
		call.setInt(1, id);
		call.execute();
		System.out.println("DAOMap running");
		System.out.println(call.getString("Map"));
		return call.getResultSet();
	}

	@Override
	public ResultSet find(String code) throws SQLException {

		final String sql = "{CALL GetMap()}";
		final CallableStatement call = this.getConnection().prepareCall(sql);
		call.execute();
		System.out.println("DAOMap running");
		System.out.println(call.getResultSet());
		return call.getResultSet();
		
	}

	@Override
	public Map find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
