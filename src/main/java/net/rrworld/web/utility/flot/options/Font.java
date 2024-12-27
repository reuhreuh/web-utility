/**
 * 
 */
package net.rrworld.web.utility.flot.options;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Font.
 * 
 * @author LRI
 * 
 */
@JsonInclude(Include.NON_NULL)
public class Font {

	private Integer size;
	private Integer lineHeight;
	private String style;
	private String weight;
	private String family;
	private String variant;
	private String color;

	public Font() {
		super();
	}

	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(final Integer size) {
		this.size = size;
	}

	/**
	 * @return the lineHeight
	 */
	public Integer getLineHeight() {
		return lineHeight;
	}

	/**
	 * @param lineHeight
	 *            the lineHeight to set
	 */
	public void setLineHeight(final Integer lineHeight) {
		this.lineHeight = lineHeight;
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style
	 *            the style to set
	 */
	public void setStyle(final String style) {
		this.style = style;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(final String weight) {
		this.weight = weight;
	}

	/**
	 * @return the family
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * @param family
	 *            the family to set
	 */
	public void setFamily(final String family) {
		this.family = family;
	}

	/**
	 * @return the variant
	 */
	public String getVariant() {
		return variant;
	}

	/**
	 * @param variant
	 *            the variant to set
	 */
	public void setVariant(final String variant) {
		this.variant = variant;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(final String color) {
		this.color = color;
	}
}
