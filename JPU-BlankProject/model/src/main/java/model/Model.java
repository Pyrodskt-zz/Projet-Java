package model;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;

import contract.IModel;
import entity.HelloWorld;
import entity.Map;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	
	private Map map;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.map = new Map();
	}

	/**
     * Gets the hello world.
     *
     * @return the hello world
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public Map getMapMap() {
		return this.map;
	}
	
	
	

	/**
     * Sets the hello world.
     *
     * @param resultSet
     *            the new hello world
     */
	

	private void setMap(final ResultSet resultSet) {
		this.map = (Map) resultSet;
		this.setChanged();
		this.notifyObservers();
	}
	/**
     * Load hello world.
     *
     * @param code
     *            the code
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	
	
	
	public void loadMap() throws SQLException {
		EventQueue.invokeLater(new Runnable() { ;
		// TODO Auto-generated method stub
public void run() {
String BDD = "jpublankproject";
String url = "jdbc:mysql://localhost/" + BDD + "?autoReconnect=true&useSSL=false";
String user = "root";
String passwd = "";

Connection connexion = null;
ResultSet resultat = null;
Statement statement = null;
int statut;
int i = 0;
final String sql = "{CALL GetMap()}";

try {
		Class.forName("com.mysql.jdbc.Driver");
		connexion = DriverManager.getConnection(url, user, passwd);
		System.out.println("Connected");
		statement = connexion.createStatement();
		resultat = statement.executeQuery(sql);
		
		//final CallableStatement call = this.prepareCall(sql);
		//call.execute();
		System.out.println("DAOMap running");
		//System.out.println(call.getResultSet());

		while(resultat.next()) {
			i++;
			System.out.print("ligne n° : " + i + " ");
			System.out.println(resultat.getString("Map"));
		}
		
}catch (SQLException e) 
{
		e.printStackTrace();
		System.out.println("Failed to connect");
		System.exit(0);
} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
finally {
		if (resultat != null)
		{
			try {
				resultat.close();
				}
		catch (SQLException ignore)
			{
			}
		}
		if (statement != null)
		{
			try {
				statement.close();
			} 
			catch (SQLException ignore) {	
			}	
		}


		if (connexion != null)
			try {
				
				connexion.close();
			}
		catch (SQLException ignore)
		{
		}
}
		// TODO Auto-generated method stub

}});
		
	}

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

	}
