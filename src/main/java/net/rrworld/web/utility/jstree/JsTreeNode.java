/**
 * 
 */
package net.rrworld.web.utility.jstree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * JsTreeNode.
 * 
 * @author LRI
 * 
 */
public class JsTreeNode implements Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = 4420960644033567088L;
	private JsTreeNodeData data;
	// <li> attributes
	private JsTreeNodeAttributes attr;
	@JsonSerialize(include = Inclusion.NON_EMPTY)
	private List<JsTreeNode> children = new ArrayList<JsTreeNode>();

	/**
	 * Build a new instance of JsTreeNode.java.
	 */
	public JsTreeNode() {
		super();
	}

	/**
	 * @return the data
	 */
	public final JsTreeNodeData getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public final void setData(final JsTreeNodeData data) {
		this.data = data;
	}

	/**
	 * @return the children
	 */
	public final List<JsTreeNode> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public final void setChildren(final List<JsTreeNode> children) {
		this.children = children;
	}

	/**
	 * @param attr
	 *            the attr to set
	 */
	public void setAttr(final JsTreeNodeAttributes attr) {
		this.attr = attr;
	}

	/**
	 * @return the attr
	 */
	public JsTreeNodeAttributes getAttr() {
		return attr;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attr == null) ? 0 : attr.hashCode());
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		final JsTreeNode other = (JsTreeNode) obj;
		if (attr == null) {
			if (other.attr != null) {
				return false;
			}
		} else if (!attr.equals(other.attr)) {
			return false;
		}
		if (children == null) {
			if (other.children != null) {
				return false;
			}
		} else if (!children.equals(other.children)) {
			return false;
		}
		if (data == null) {
			if (other.data != null) {
				return false;
			}
		} else if (!data.equals(other.data)) {
			return false;
		}
		return true;
	}
}
