/**
 * 
 */
package net.rrworld.web.utility.flot.options.graphseries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PieOptions. 
 *
 * @author LRI
 *
 */
@JsonInclude(Include.NON_NULL)
public class PieOptions extends SeriesOptions {
	/** */
	private Double radius;
	/** */
	private PieLabel label;
	/** */
	private Double innerRadius;

	public PieOptions() {
		super();
		this.setShow(Boolean.TRUE);
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
	 * @return the label
	 */
	public PieLabel getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(PieLabel label) {
		this.label = label;
	}

	/**
	 * @return the innerRadius
	 */
	public Double getInnerRadius() {
		return innerRadius;
	}

	/**
	 * @param innerRadius the innerRadius to set
	 */
	public void setInnerRadius(Double innerRadius) {
		this.innerRadius = innerRadius;
	}
}
