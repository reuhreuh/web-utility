/**
 * 
 */
package net.rrworld.web.utility.datatables;

import java.io.Serializable;

/**
 * Order. 
 *
 * @author LRI
 *
 */
public class Order implements Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = -5377533823768186133L;
	private Integer column;
	private OrderDir dir;
	/**
	 * Build a new instance of Order.java.
	 */
	public Order() {
		super();
	}
	/**
	 * @return the column
	 */
	public Integer getColumn() {
		return column;
	}
	/**
	 * @param column the column to set
	 */
	public void setColumn(Integer column) {
		this.column = column;
	}
	/**
	 * @return the dir
	 */
	public OrderDir getDir() {
		return dir;
	}
	/**
	 * @param dir the dir to set
	 */
	public void setDir(OrderDir dir) {
		this.dir = dir;
	}
}
