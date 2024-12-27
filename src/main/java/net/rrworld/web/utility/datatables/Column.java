/**
 * 
 */
package net.rrworld.web.utility.datatables;

import java.io.Serializable;

/**
 * Column. 
 *
 * @author LRI
 *
 */
public class Column implements Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = 4323162115346904576L;
	
	private String data;
	private String name;
	private Boolean orderable;
	private Boolean searchable;
	private Search search;
	
	/**
	 * Build a new instance of Column.java.
	 */
	public Column() {
		super();
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the orderable
	 */
	public Boolean getOrderable() {
		return orderable;
	}
	/**
	 * @param orderable the orderable to set
	 */
	public void setOrderable(Boolean orderable) {
		this.orderable = orderable;
	}
	/**
	 * @return the searchable
	 */
	public Boolean getSearchable() {
		return searchable;
	}
	/**
	 * @param searchable the searchable to set
	 */
	public void setSearchable(Boolean searchable) {
		this.searchable = searchable;
	}
	/**
	 * @return the search
	 */
	public Search getSearch() {
		return search;
	}
	/**
	 * @param search the search to set
	 */
	public void setSearch(Search search) {
		this.search = search;
	}
}
