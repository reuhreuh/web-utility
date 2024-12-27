/**
 * 
 */
package net.rrworld.web.utility.flot.options.graphseries;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * DashesOptions. 
 *
 * @author LRI
 *
 */
@JsonInclude(Include.NON_NULL)
public class DashesOptions extends SeriesOptions {

	private Integer dashLength = null;;

	public DashesOptions() {
		super();
	}

	/**
	 * @return the dashLength
	 */
	public Integer getDashLength() {
		return dashLength;
	}

	/**
	 * @param dashLength the dashLength to set
	 */
	public void setDashLength(Integer dashLength) {
		this.dashLength = dashLength;
	}

}
