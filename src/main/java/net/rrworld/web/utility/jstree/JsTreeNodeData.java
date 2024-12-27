/**
 * 
 */
package net.rrworld.web.utility.jstree;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * JsTreeNodeData.
 * 
 * @author LRI
 * 
 */
public class JsTreeNodeData implements Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = 8549997733031702424L;

	private String title;
	// <a> attributes
	@JsonSerialize(include = Inclusion.NON_NULL)
	private JsTreeNodeAttributes attr;

	/**
	 * Build a new instance of JsTreeNodeData.java.
	 */
	public JsTreeNodeData() {
		super();
	}

	/**
	 * @return the title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public final void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * @return the attr
	 */
	public final JsTreeNodeAttributes getAttr() {
		return attr;
	}

	/**
	 * @param attr
	 *            the attr to set
	 */
	public final void setAttr(final JsTreeNodeAttributes attr) {
		this.attr = attr;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attr == null) ? 0 : attr.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final JsTreeNodeData other = (JsTreeNodeData) obj;
		if (attr == null) {
			if (other.attr != null) {
				return false;
			}
		} else if (!attr.equals(other.attr)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}
}
