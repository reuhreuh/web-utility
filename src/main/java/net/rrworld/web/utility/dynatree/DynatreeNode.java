/**
 * 
 */
package net.rrworld.web.utility.dynatree;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * DynatreeNode represent a node used in the JS tree plugin : dynatree. This
 * object is a java representation, so the JSON generated from this class will
 * match the JS plugin.
 * 
 * @author LRI
 * 
 */
public class DynatreeNode implements Comparable<DynatreeNode> {

	@JsonInclude(Include.NON_NULL)
	private String title;

	@JsonInclude(Include.NON_NULL)
	private Boolean isFolder = null;

	@JsonInclude(Include.NON_NULL)
	private String key;

	@JsonInclude(Include.NON_NULL)
	private Boolean select = null;
	
	@JsonInclude(Include.NON_NULL)
	private Boolean expand = null;

	@JsonInclude(Include.NON_EMPTY)
	private List<DynatreeNode> children = new ArrayList<DynatreeNode>();

	@JsonInclude(Include.NON_NULL)
	private Boolean activate = null;
	
	@JsonInclude(Include.NON_NULL)
	private Boolean isLazy = null;
	
	@JsonInclude(Include.NON_NULL)
	private Boolean unselectable = null;

	/**
	 * Defaut constructor
	 */
	public DynatreeNode() {
		super();
	}

	/**
	 * Constructor with data
	 * 
	 * @param title
	 * @param isFolder
	 * @param key
	 */
	public DynatreeNode(final String title, final Boolean isFolder, final String key) {
		super();
		this.title = title;
		this.isFolder = isFolder;
		this.key = key;
	}

	/**
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	@JsonIgnore
	public int compareTo(DynatreeNode n) {
		if(this.title != null && n.getTitle() != null){
			return this.title.compareTo(n.getTitle());
		}
		if(this.title == null){
			return -1;
		}
		
		if(n.getTitle() == null){
			return 1;
		}
		
		return 0;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the isFolder
	 */
	public Boolean getIsFolder() {
		return isFolder;
	}

	/**
	 * @param isFolder the isFolder to set
	 */
	public void setIsFolder(Boolean isFolder) {
		this.isFolder = isFolder;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the select
	 */
	public Boolean getSelect() {
		return select;
	}

	/**
	 * @param select the select to set
	 */
	public void setSelect(Boolean select) {
		this.select = select;
	}

	/**
	 * @return the expand
	 */
	public Boolean getExpand() {
		return expand;
	}

	/**
	 * @param expand the expand to set
	 */
	public void setExpand(Boolean expand) {
		this.expand = expand;
	}

	/**
	 * @return the children
	 */
	public List<DynatreeNode> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(List<DynatreeNode> children) {
		this.children = children;
	}

	/**
	 * @return the activate
	 */
	public Boolean getActivate() {
		return activate;
	}

	/**
	 * @param activate the activate to set
	 */
	public void setActivate(Boolean activate) {
		this.activate = activate;
	}

	/**
	 * @return the isLazy
	 */
	public Boolean getIsLazy() {
		return isLazy;
	}

	/**
	 * @param isLazy the isLazy to set
	 */
	public void setIsLazy(Boolean isLazy) {
		this.isLazy = isLazy;
	}

	/**
	 * @return the unselectable
	 */
	public Boolean getUnselectable() {
		return unselectable;
	}

	/**
	 * @param unselectable the unselectable to set
	 */
	public void setUnselectable(Boolean unselectable) {
		this.unselectable = unselectable;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activate == null) ? 0 : activate.hashCode());
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((isFolder == null) ? 0 : isFolder.hashCode());
		result = prime * result + ((isLazy == null) ? 0 : isLazy.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((select == null) ? 0 : select.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((unselectable == null) ? 0 : unselectable.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DynatreeNode other = (DynatreeNode) obj;
		if (activate == null) {
			if (other.activate != null)
				return false;
		} else if (!activate.equals(other.activate))
			return false;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (isFolder == null) {
			if (other.isFolder != null)
				return false;
		} else if (!isFolder.equals(other.isFolder))
			return false;
		if (isLazy == null) {
			if (other.isLazy != null)
				return false;
		} else if (!isLazy.equals(other.isLazy))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (select == null) {
			if (other.select != null)
				return false;
		} else if (!select.equals(other.select))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (unselectable == null) {
			if (other.unselectable != null)
				return false;
		} else if (!unselectable.equals(other.unselectable))
			return false;
		return true;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DynatreeNode [title=" + title + ", isFolder=" + isFolder + ", key=" + key + ", select=" + select + ", children=" + children + ", activate=" + activate + ", isLazy=" + isLazy + ", unselectable=" + unselectable + "]";
	}
}
