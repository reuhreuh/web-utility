package net.rrworld.web.utility.flot.options;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * Marking. "markings" is used to draw simple lines and rectangular areas in the
 * background of the plot. You can either specify an array of ranges on the form
 * { xaxis: { from, to }, yaxis: { from, to } } (with multiple axes, you can
 * specify coordinates for other axes instead, e.g. as x2axis/x3axis/...) or
 * with a function that returns such an array given the axes for the plot in an
 * object as the first parameter.
 * <p>
 * You can set the color of markings by specifying "color" in the ranges object.
 * Here's an example array:
 * 
 * <pre>
 *   markings: [ { xaxis: { from: 0, to: 2 }, yaxis: { from: 10, to: 10 }, color: "#bb0000" }, ... ]
 * </pre>
 * 
 * If you leave out one of the values, that value is assumed to go to the border
 * of the plot. So for example if you only specify { xaxis: { from: 0, to: 2 } }
 * it means an area that extends from the top to the bottom of the plot in the x
 * range 0-2.
 * <p>
 * A line is drawn if from and to are the same, e.g.
 * 
 * <pre>
 *   markings: [ { yaxis: { from: 1, to: 1 } }, ... ]
 * </pre>
 * 
 * would draw a line parallel to the x axis at y = 1. You can control the line
 * width with "lineWidth" in the range object.
 * 
 * @param markings
 *            array of markings or (fn: axes -> array of markings)
 * @author RGS
 * 
 */
@JsonInclude(Include.NON_NULL)
public class Marking {

	private String color;
	private Axis xaxis;
	private Axis yaxis;
	private Double lineWidth;

	public Marking() {
		super();
	}
	
	@JsonInclude(Include.NON_NULL)
	public class Axis {
		private Double from;
		private Double to;
		
		public Axis(){
			super();
		}
		
		public Axis(Double from, Double to){
			super();
			this.from=from;
			this.to=to;
		}

		/**
		 * @return the from
		 */
		public Double getFrom() {
			return from;
		}

		/**
		 * @param from the from to set
		 */
		public void setFrom(Double from) {
			this.from = from;
		}

		/**
		 * @return the to
		 */
		public Double getTo() {
			return to;
		}

		/**
		 * @param to the to to set
		 */
		public void setTo(Double to) {
			this.to = to;
		}
		
		
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
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the xaxis
	 */
	public Axis getXaxis() {
		return xaxis;
	}

	/**
	 * @param xaxis
	 *            the xaxis to set
	 */
	public void setXaxis(Double from, Double to) {
		Axis axis = new Axis(from, to);
		this.xaxis = axis;
	}

	/**
	 * @return the yaxis
	 */
	public Axis getYaxis() {
		return yaxis;
	}

	/**
	 * @param yAxis
	 *            the yAxis to set
	 */
	public void setYaxis(Double from, Double to) {
		Axis axis = new Axis(from, to);
		this.yaxis = axis;
	}

	/**
	 * @return the lineWidth
	 */
	public Double getLineWidth() {
		return lineWidth;
	}

	/**
	 * @param lineWidth
	 *            the lineWidth to set
	 */
	public void setLineWidth(Double lineWidth) {
		this.lineWidth = lineWidth;
	}

}
