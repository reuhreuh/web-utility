/**
 * 
 */
package net.rrworld.web.utility.dynatree;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Java representation of JS tree classNames attribute
 * 
 * @author LRI
 * 
 */
@JsonInclude(Include.NON_NULL)
public class DynatreeClassNames {

	private String node;
	private String folder;
	private String hasChildren;
	private String nodeIcon;

	public DynatreeClassNames() {
		super();
	}

	/**
	 * @return the node
	 */
	public String getNode() {
		return node;
	}

	/**
	 * @param node
	 *            the node to set
	 */
	public void setNode(final String node) {
		this.node = node;
	}

	/**
	 * @return the folder
	 */
	public String getFolder() {
		return folder;
	}

	/**
	 * @param folder
	 *            the folder to set
	 */
	public void setFolder(final String folder) {
		this.folder = folder;
	}

	/**
	 * @return the hasChildren
	 */
	public String getHasChildren() {
		return hasChildren;
	}

	/**
	 * @param hasChildren
	 *            the hasChildren to set
	 */
	public void setHasChildren(final String hasChildren) {
		this.hasChildren = hasChildren;
	}

	/**
	 * @return the nodeIcon
	 */
	public String getNodeIcon() {
		return nodeIcon;
	}

	/**
	 * @param nodeIcon
	 *            the nodeIcon to set
	 */
	public void setNodeIcon(final String nodeIcon) {
		this.nodeIcon = nodeIcon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((folder == null) ? 0 : folder.hashCode());
		result = prime * result + ((hasChildren == null) ? 0 : hasChildren.hashCode());
		result = prime * result + ((node == null) ? 0 : node.hashCode());
		result = prime * result + ((nodeIcon == null) ? 0 : nodeIcon.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		final DynatreeClassNames other = (DynatreeClassNames) obj;
		if (folder == null) {
			if (other.folder != null) {
				return false;
			}
		} else if (!folder.equals(other.folder)) {
			return false;
		}
		if (hasChildren == null) {
			if (other.hasChildren != null) {
				return false;
			}
		} else if (!hasChildren.equals(other.hasChildren)) {
			return false;
		}
		if (node == null) {
			if (other.node != null) {
				return false;
			}
		} else if (!node.equals(other.node)) {
			return false;
		}
		if (nodeIcon == null) {
			if (other.nodeIcon != null) {
				return false;
			}
		} else if (!nodeIcon.equals(other.nodeIcon)) {
			return false;
		}
		return true;
	}
}
