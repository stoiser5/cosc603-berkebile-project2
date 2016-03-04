package edu.towson.cis.cosc603.project2.monopoly;

public interface IOwnable {

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public abstract int getPrice();

	/**
	 * Play action.
	 * @param msg TODO
	 * @return TODO
	 */
	public abstract boolean playAction(String msg);

}