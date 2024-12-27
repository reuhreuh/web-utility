package net.rrworld.web.utility.flot.options.graphseries;

/**
 * Lines options.
 * <pre>
 * lines: {
 *   steps: boolean
 * }
 * </pre>
 */
public class LinesOptions extends SeriesOptions {
	/** */
	private Boolean steps;
	/** */
	private Integer shadowSize;
	

	/**
	 * For lines, "steps" specifies whether two adjacent data points are
	 * connected with a straight (possibly diagonal) line or with first a
	 * horizontal and then a vertical line. Note that this transforms the
	 * data by adding extra points.
	 * <p>
	 * @param steps the steps to set
	 */
	public void setSteps(final Boolean steps) {
		this.steps = steps;
	}

	/**
	 * @return the steps
	 */
	public Boolean getSteps() {
		return steps;
	}

	/**
	 * @return the shadowSize
	 */
	public Integer getShadowSize() {
		return shadowSize;
	}

	/**
	 * @param shadowSize the shadowSize to set
	 */
	public void setShadowSize(Integer shadowSize) {
		this.shadowSize = shadowSize;
	}
}
