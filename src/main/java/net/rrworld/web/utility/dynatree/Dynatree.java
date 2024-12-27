/**
 * 
 */
package net.rrworld.web.utility.dynatree;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 * Dynatree represent a tree used in the JS tree plugin : dynatree. This object
 * is a java representation, so the JSON generated from this class will match
 * the JS plugin.
 * 
 * @author LRI
 * 
 */
public class Dynatree {

	/**
	 * The tree can have multiple roots.
	 */
	@JsonInclude(Include.NON_EMPTY)
	private List<DynatreeNode> children = new ArrayList<DynatreeNode>();

	@JsonInclude(Include.NON_NULL)
	private Boolean checkbox = null;

	@JsonInclude(Include.NON_NULL)
	private Boolean generateIds = null;

	@JsonInclude(Include.NON_NULL)
	private String idPrefix = null;

	@JsonInclude(Include.NON_NULL)
	private Boolean activeVisible = null;

	@JsonInclude(Include.NON_NULL)
	private DynatreeClassNames classNames = null;

	@JsonInclude(Include.NON_NULL)
	private Integer debugLevel = null;
	
	@JsonInclude(Include.NON_NULL)
	private Integer selectMode = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonRawValue
	private Object onLazyRead = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonRawValue
	private String onQuerySelect = null;

	/**
	 * Build a new instance of Dynatree.java.
	 */
	public Dynatree() {
		super();
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
	 * @return the checkbox
	 */
	public Boolean getCheckbox() {
		return checkbox;
	}

	/**
	 * @param checkbox the checkbox to set
	 */
	public void setCheckbox(Boolean checkbox) {
		this.checkbox = checkbox;
	}

	/**
	 * @return the generateIds
	 */
	public Boolean getGenerateIds() {
		return generateIds;
	}

	/**
	 * @param generateIds the generateIds to set
	 */
	public void setGenerateIds(Boolean generateIds) {
		this.generateIds = generateIds;
	}

	/**
	 * @return the idPrefix
	 */
	public String getIdPrefix() {
		return idPrefix;
	}

	/**
	 * @param idPrefix the idPrefix to set
	 */
	public void setIdPrefix(String idPrefix) {
		this.idPrefix = idPrefix;
	}

	/**
	 * @return the activeVisible
	 */
	public Boolean getActiveVisible() {
		return activeVisible;
	}

	/**
	 * @param activeVisible the activeVisible to set
	 */
	public void setActiveVisible(Boolean activeVisible) {
		this.activeVisible = activeVisible;
	}

	/**
	 * @return the classNames
	 */
	public DynatreeClassNames getClassNames() {
		return classNames;
	}

	/**
	 * @param classNames the classNames to set
	 */
	public void setClassNames(DynatreeClassNames classNames) {
		this.classNames = classNames;
	}

	/**
	 * @return the debugLevel
	 */
	public Integer getDebugLevel() {
		return debugLevel;
	}

	/**
	 * @param debugLevel the debugLevel to set
	 */
	public void setDebugLevel(Integer debugLevel) {
		this.debugLevel = debugLevel;
	}

	/**
	 * @return the selectMode
	 */
	public Integer getSelectMode() {
		return selectMode;
	}

	/**
	 * @param selectMode the selectMode to set
	 */
	public void setSelectMode(Integer selectMode) {
		this.selectMode = selectMode;
	}

	/**
	 * @return the onLazyRead
	 */
	public Object getOnLazyRead() {
		return onLazyRead;
	}

	/**
	 * @param onLazyRead the onLazyRead to set
	 */
	public void setOnLazyRead(Object onLazyRead) {
		this.onLazyRead = onLazyRead;
	}

	/**
	 * @return the onQuerySelect
	 */
	public String getOnQuerySelect() {
		return onQuerySelect;
	}

	/**
	 * @param onQuerySelect the onQuerySelect to set
	 */
	public void setOnQuerySelect(String onQuerySelect) {
		this.onQuerySelect = onQuerySelect;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activeVisible == null) ? 0 : activeVisible.hashCode());
		result = prime * result + ((checkbox == null) ? 0 : checkbox.hashCode());
		result = prime * result + ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((classNames == null) ? 0 : classNames.hashCode());
		result = prime * result + ((debugLevel == null) ? 0 : debugLevel.hashCode());
		result = prime * result + ((generateIds == null) ? 0 : generateIds.hashCode());
		result = prime * result + ((idPrefix == null) ? 0 : idPrefix.hashCode());
		result = prime * result + ((onLazyRead == null) ? 0 : onLazyRead.hashCode());
		result = prime * result + ((onQuerySelect == null) ? 0 : onQuerySelect.hashCode());
		result = prime * result + ((selectMode == null) ? 0 : selectMode.hashCode());
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
		Dynatree other = (Dynatree) obj;
		if (activeVisible == null) {
			if (other.activeVisible != null)
				return false;
		} else if (!activeVisible.equals(other.activeVisible))
			return false;
		if (checkbox == null) {
			if (other.checkbox != null)
				return false;
		} else if (!checkbox.equals(other.checkbox))
			return false;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (classNames == null) {
			if (other.classNames != null)
				return false;
		} else if (!classNames.equals(other.classNames))
			return false;
		if (debugLevel == null) {
			if (other.debugLevel != null)
				return false;
		} else if (!debugLevel.equals(other.debugLevel))
			return false;
		if (generateIds == null) {
			if (other.generateIds != null)
				return false;
		} else if (!generateIds.equals(other.generateIds))
			return false;
		if (idPrefix == null) {
			if (other.idPrefix != null)
				return false;
		} else if (!idPrefix.equals(other.idPrefix))
			return false;
		if (onLazyRead == null) {
			if (other.onLazyRead != null)
				return false;
		} else if (!onLazyRead.equals(other.onLazyRead))
			return false;
		if (onQuerySelect == null) {
			if (other.onQuerySelect != null)
				return false;
		} else if (!onQuerySelect.equals(other.onQuerySelect))
			return false;
		if (selectMode == null) {
			if (other.selectMode != null)
				return false;
		} else if (!selectMode.equals(other.selectMode))
			return false;
		return true;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dynatree [children=" + children + ", checkbox=" + checkbox + ", generateIds=" + generateIds + ", idPrefix=" + idPrefix + ", activeVisible=" + activeVisible + ", classNames=" + classNames + ", debugLevel=" + debugLevel
				+ ", selectMode=" + selectMode + ", onLazyRead=" + onLazyRead + ", onQuerySelect=" + onQuerySelect + "]";
	}
}
