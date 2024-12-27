/**
 * 
 */
package net.rrworld.web.utility.flot.options.graphseries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PieBackground. 
 *
 * @author LRI
 *
 */
@JsonInclude(Include.NON_NULL)
public class PieBackground {
	/** */
	private Double opacity;
	/** */
	private String color;
	
	/**
	 * 
	 * Build a new instance of PieBackground.java.
	 */
	public PieBackground() {
		super();
	}
	/**
	 * @return the opacity
	 */
	public Double getOpacity() {
		return opacity;
	}
	/**
	 * @param opacity the opacity to set
	 */
	public void setOpacity(Double opacity) {
		this.opacity = opacity;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
}
