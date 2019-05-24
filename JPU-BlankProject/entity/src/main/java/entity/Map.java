package entity;

public class Map extends Entity{
	private int			id;

	/** The key. */


	/** The message. */
	private String	map;

	/**
	 * Instantiates a new hello world.
	 *
	 * @param id
	 *          the id
	 * @param key
	 *          the key
	 * @param message
	 *          the message
	 */
	public Map(final int id, final String map) {
		this.setId(id);
	
		this.setMap(map);
	}

	/**
	 * Instantiates a new hello world.
	 */
	public Map() {
		this(0, "");
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */


	/**
	 * Sets the key.
	 *
	 * @param key
	 *          the new key
	 */

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMap() {
		return this.map;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	public void setMap(final String message) {
		this.map = message;
	}
}
