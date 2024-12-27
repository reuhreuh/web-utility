/**
 * 
 */
package net.rrworld.web.utility.jstree;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import net.rrworld.web.utility.jstree.json.JsTreeNodeAttributesSerializer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

/**
 * JsTreeNodeAttribute is map of attributes with key/value. Those attributes
 * will be written on the &lt;li /&gt; or the &lt;a /&gt; element of the html
 * node.
 * 
 * @author LRI
 * 
 */
@JsonSerialize(using = JsTreeNodeAttributesSerializer.class, include = Inclusion.NON_EMPTY)
public class JsTreeNodeAttributes implements Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = -6927096171672184613L;

	/**
	 * Attributes lists with name as key and value as value.
	 */
	private Map<String, String> attributes = new HashMap<String, String>();

	/**
	 * Build a new instance of JsTreeNodeAttribute.java.
	 */
	public JsTreeNodeAttributes() {
		super();
	}

	/**
	 * @return the attributes
	 */
	public final Map<String, String> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public final void setAttributes(final Map<String, String> attributes) {
		this.attributes = attributes;
	}

	/**
	 * Add or update an attribute and its value to the map
	 * 
	 * @param key
	 * @param value
	 */
	@JsonIgnore
	public void putAttribute(final String key, final String value) {
		attributes.put(key, value);
	}
}
