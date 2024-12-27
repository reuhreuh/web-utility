/**
 * 
 */
package net.rrworld.web.utility.flot.options.graphseries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PieLabel. 
 *
 * @author LRI
 *
 */
@JsonInclude(Include.NON_NULL)
public class PieLabel {
	/** */
	private Boolean show;
	/** */
	private Double radius;
	/** */
	private String formatter;
	/** */
	private PieBackground background;
	
	/**
	 * 
	 * Build a new instance of PieLabel.java.
	 */
	public PieLabel() {
		super();
	}
	/**
	 * @return the show
	 */
	public Boolean getShow() {
		return show;
	}
	/**
	 * @param show the show to set
	 */
	public void setShow(Boolean show) {
		this.show = show;
	}
	/**
	 * @return the radius
	 */
	public Double getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	/**
	 * @return the formatter
	 */
	public String getFormatter() {
		return formatter;
	}
	/**
	 * @param formatter the formatter to set
	 */
	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
	/**
	 * @return the background
	 */
	public PieBackground getBackground() {
		return background;
	}
	/**
	 * @param background the background to set
	 */
	public void setBackground(PieBackground background) {
		this.background = background;
	}
	
}
