package net.rrworld.web.utility.jstree;

import java.util.ArrayList;
import java.util.List;

import net.rrworld.web.utility.jstree.json.JsTreeSerializer;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * JsTree is a Java representation of the JSON used in jquery.jstree.js
 * component. Once the JsTree object is loaded, it can be JSONised to be loaded
 * in the javascript component with json_data plugin.
 * 
 * @author LRI
 * 
 */
@JsonSerialize(using = JsTreeSerializer.class)
public class JsTree {

	/**
	 * The tree can have multiple roots.
	 */
	private List<JsTreeNode> roots = new ArrayList<JsTreeNode>();

	/**
	 * Build a new instance of JsTree.java.
	 */
	public JsTree() {
		super();
	}

	/**
	 * @return the roots
	 */
	public final List<JsTreeNode> getRoots() {
		return roots;
	}

	/**
	 * @param roots
	 *            the roots to set
	 */
	public final void setRoots(final List<JsTreeNode> roots) {
		this.roots = roots;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roots == null) ? 0 : roots.hashCode());
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
		final JsTree other = (JsTree) obj;
		if (roots == null) {
			if (other.roots != null) {
				return false;
			}
		} else if (!roots.equals(other.roots)) {
			return false;
		}
		return true;
	}
}
