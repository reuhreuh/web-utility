package net.rrworld.web.utility.flot.data;

import java.util.ArrayList;
import java.util.List;

import net.rrworld.web.utility.flot.options.Series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The data is an array of data series:
 * <pre>
 * [ series1, series2, ... ]
 * </pre>
 * A series can either be raw data or an object with properties. The raw
 * data format is an array of points:
 * <pre>
 *   [ [x1, y1], [x2, y2], ... ]
 * </pre>
 * E.g.
 * <pre>
 *   [ [1, 3], [2, 14.01], [3.5, 3.14] ]
 * </pre>
 * Note that to simplify the internal logic in Flot both the x and y
 * values must be numbers (even if specifying time series, see below for
 * how to do this). This is a common problem because you might retrieve
 * data from the database and serialize them directly to JSON without
 * noticing the wrong type. If you're getting mysterious errors, double
 * check that you're inputting numbers and not strings.
 * <p>
 * If a null is specified as a point or if one of the coordinates is null
 * or couldn't be converted to a number, the point is ignored when
 * drawing. As a special case, a null value for lines is interpreted as a
 * line segment end, i.e. the points before and after the null value are
 * not connected.
 * <p>
 * Lines and points take two coordinates. For filled lines and bars, you
 * can specify a third coordinate which is the bottom of the filled
 * area/bar (defaults to 0).
 * <p>
 * <b>JSON Data format for Data:</b>
 * <pre>
 * {
 *   color: color or number
 *   data: rawdata
 *   label: string
 *   lines: specific lines options
 *   bars: specific bars options
 *   points: specific points options
 *   xaxis: number
 *   yaxis: number
 *   clickable: boolean
 *   hoverable: boolean
 *   shadowSize: number
 * }
 * </pre>
 * This class has been constructed as per flot API documentation.
 * @see <A href="http://flot.googlecode.com/svn/trunk/API.txt" target="_blank">Flot API.txt</A>
 */
public class PlotData extends Series {
	/** */
	private String color = null;
	/** */
	private ArrayList<Object[]> data = new ArrayList<Object[]>();
	/** */
	private String label = null;
	/** */
	private Integer xaxis = null;
	/** */
	private Integer yaxis = null;
	/** */
	private Boolean clickable = null;
	/** */
	private Boolean hoverable = null;
	/** */
	private String fillBetween = null;
	/** */
	private String id = null;
	/**
	 * showLabels property for jquery.flot.labels.js plugin
	 */
	private Boolean showLabels = false;
	/**
	 * labels property for jquery.flot.labels.js plugin
	 */
	private List<String> labels = null;
	/**
	 * labelPlacement property for jquery.flot.labels.js plugin.
	 */
	private String labelPlacement = null;
	/**
	 * canvasRender property for jquery.flot.labels.js plugin.
	 */
	private Boolean canvasRender=true;
	/**
	 * cColor property for jquery.flot.labels.js plugin.
	 */
	private String cColor=null;
	
	@JsonInclude(Include.NON_EMPTY)
	private ArrayList<Constraint> constraints;

	/**
	 *
	 */
	public PlotData() {
	}

	/**
	 * @param label Plot Label
	 * @param color Plot Colour
	 */
	public PlotData(final String label, final String color) {
		this.label = label;
		this.color = color;
	}

	/**
	 * @param x X coordinate
	 * @param y Y coordinate
	 */
	public void addPoint(final Object x, final Object y) {
		Object[] point = new Object[2];
		point[0] = x;
		point[1] = y;
		this.data.add(point);
	}

	/**
	 *
	 */
	public void setRightYAxis() {
		this.yaxis = new Integer(2);
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(final String color) {
		this.color = color;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(final ArrayList<Object[]> data) {
		this.data = data;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(final String label) {
		this.label = label;
	}

	/**
	 * The "xaxis" and "yaxis" options specify which axis to use. The axes
	 * are numbered from 1 (default), so { yaxis: 2} means that the series
	 * should be plotted against the second y axis.
	 *
	 * @param xaxis the xaxis to set
	 */
	public void setXaxis(final Integer xaxis) {
		this.xaxis = xaxis;
	}

	/**
	 * The "xaxis" and "yaxis" options specify which axis to use. The axes
	 * are numbered from 1 (default), so { yaxis: 2} means that the series
	 * should be plotted against the second y axis.
	 *
	 * @param yaxis the yaxis to set
	 */
	public void setYaxis(final Integer yaxis) {
		this.yaxis = yaxis;
	}

	/**
	 * "clickable" and "hoverable" can be set to false to disable
	 * interactivity for specific series if interactivity is turned on in
	 * the plot, see TODO.
	 *
	 * @param clickable the clickable to set
	 */
	public void setClickable(final Boolean clickable) {
		this.clickable = clickable;
	}

	/**
	 * "clickable" and "hoverable" can be set to false to disable
	 * interactivity for specific series if interactivity is turned on in
	 * the plot, see TODO.
	 *
	 * @param hoverable the hoverable to set
	 */
	public void setHoverable(final Boolean hoverable) {
		this.hoverable = hoverable;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the data
	 */
	public ArrayList<Object[]> getData() {
		return data;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the xaxis
	 */
	public Integer getXaxis() {
		return xaxis;
	}

	/**
	 * @return the yaxis
	 */
	public Integer getYaxis() {
		return yaxis;
	}

	/**
	 * @return the clickable
	 */
	public Boolean getClickable() {
		return clickable;
	}

	/**
	 * @return the hoverable
	 */
	public Boolean getHoverable() {
		return hoverable;
	}

	/**
	 * @return the constraints
	 */
	public ArrayList<Constraint> getConstraints() {
		return constraints;
	}

	/**
	 * @param constraints the constraints to set
	 */
	public void setConstraints(ArrayList<Constraint> constraints) {
		this.constraints = constraints;
	}

	/**
	 * @return the fillBetween
	 */
	public String getFillBetween() {
		return fillBetween;
	}

	/**
	 * @param fillBetween the fillBetween to set
	 */
	public void setFillBetween(String fillBetween) {
		this.fillBetween = fillBetween;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the showLabels
	 */
	public Boolean getShowLabels() {
		return showLabels;
	}

	/**
	 * @param showLabels the showLabels to set
	 */
	public void setShowLabels(Boolean showLabels) {
		this.showLabels = showLabels;
	}

	/**
	 * @return the labels
	 */
	public List<String> getLabels() {
		return labels;
	}

	/**
	 * @param labels the labels to set
	 */
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	/**
	 * @return the labelPlacement
	 */
	public String getLabelPlacement() {
		return labelPlacement;
	}

	/**
	 * @param labelPlacement the labelPlacement to set
	 */
	public void setLabelPlacement(String labelPlacement) {
		this.labelPlacement = labelPlacement;
	}

	/**
	 * @return the canvasRender
	 */
	public Boolean getCanvasRender() {
		return canvasRender;
	}

	/**
	 * @param canvasRender the canvasRender to set
	 */
	public void setCanvasRender(Boolean canvasRender) {
		this.canvasRender = canvasRender;
	}

	/**
	 * @return the cColor
	 */
	public String getcColor() {
		return cColor;
	}

	/**
	 * @param cColor the cColor to set
	 */
	public void setcColor(String cColor) {
		this.cColor = cColor;
	}
}
