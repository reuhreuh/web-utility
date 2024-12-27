package net.rrworld.web.utility.datatables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * DataTableSSRequest is a wrapper for parameters posted by Ajax Datatables Request 
 *
 * @author LRI
 *
 */
public class DataTableSSRequest implements Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = 612405475092179775L;
	
	private Integer draw;
	private Integer length;
	private Integer start;
	private Search search;
	private List<Column> columns = new ArrayList<Column>();
	private List<Order> order = new ArrayList<Order>();
	
	/**
	 * Build a new instance of DataTableSSRequest.java.
	 */
	public DataTableSSRequest() {
		super();
	}
	
	/**
	 * @return the draw
	 */
	public Integer getDraw() {
		return draw;
	}
	/**
	 * @param draw the draw to set
	 */
	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	/**
	 * @return the length
	 */
	public Integer getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(Integer length) {
		this.length = length;
	}
	/**
	 * @return the start
	 */
	public Integer getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(Integer start) {
		this.start = start;
	}

	/**
	 * 
	 * @return
	 */
	public Search getSearch() {
		return search;
	}

	/**
	 * 
	 * @param search
	 */
	public void setSearch(Search search) {
		this.search = search;
	}

	/**
	 * @return the columns
	 */
	public List<Column> getColumns() {
		return columns;
	}

	/**
	 * @param columns the columns to set
	 */
	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	/**
	 * 
	 * @return
	 */
	public List<Order> getOrder() {
		return order;
	}

	/**
	 * 
	 * @param order
	 */
	public void setOrder(List<Order> order) {
		this.order = order;
	}
}
