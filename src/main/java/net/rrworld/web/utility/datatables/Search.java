/**
 * 
 */
package net.rrworld.web.utility.datatables;

import java.io.Serializable;

/**
 * Search.
 * 
 * @author LRI
 * 
 */
public class Search implements Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = 3195763387473713265L;
	
	private Boolean regex = Boolean.FALSE;
	private String value;

	/**
	 * Build a new instance of Search.java.
	 */
	public Search() {
		super();
	}

	/**
	 * Build a new instance of Search.java.
	 * 
	 * @param regex
	 * @param value
	 */
	public Search(Boolean regex, String value) {
		super();
		this.regex = regex;
		this.value = value;
	}

	/**
	 * @return the regex
	 */
	public Boolean getRegex() {
		return regex;
	}

	/**
	 * @param regex
	 *            the regex to set
	 */
	public void setRegex(Boolean regex) {
		this.regex = regex;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
