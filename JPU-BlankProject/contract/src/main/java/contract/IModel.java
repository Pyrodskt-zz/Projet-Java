package contract;

import java.sql.SQLException;
import java.util.Observable;

import entity.HelloWorld;
import entity.Map;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Gets the hello world.
	 *
	 * @return the helloworld entity
	 */
	
	Map getMapMap();
	void loadMap() throws SQLException;

	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code


	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
