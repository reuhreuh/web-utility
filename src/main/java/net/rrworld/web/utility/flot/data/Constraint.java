/**
 * 
 */
package net.rrworld.web.utility.flot.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Constraint. 
 *
 * @author LRI
 *
 */
@JsonInclude(Include.NON_NULL)
public class Constraint {
	
	private Double threshold = null;;
	private String color = null;
	private String evaluate = null;
	
	/**
	 * 
	 * Build a new instance of Constraint.java.
	 */
	public Constraint() {
		super();
	}
	/**
	 * @return the threshold
	 */
	public Double getThreshold() {
		return threshold;
	}
	/**
	 * @param threshold the threshold to set
	 */
	public void setThreshold(Double threshold) {
		this.threshold = threshold;
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
	/**
	 * @return the evaluate
	 */
	public String getEvaluate() {
		return evaluate;
	}
	/**
	 * @param evaluate the evaluate to set
	 */
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	
	
}
