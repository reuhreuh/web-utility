package net.rrworld.web.utility.flot;

import java.util.ArrayList;
import java.util.List;

import net.rrworld.web.utility.flot.data.PlotData;
import net.rrworld.web.utility.flot.options.Axis;
import net.rrworld.web.utility.flot.options.Grid;
import net.rrworld.web.utility.flot.options.PlotOptions;
import net.rrworld.web.utility.flot.options.plugins.CrossHair;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author LRI
 *
 */
@JsonInclude(Include.NON_NULL)
public class Chart {
	/** */
	@JsonInclude(Include.NON_EMPTY)
	private ArrayList<PlotData> chartsdata;
	/** */
	private PlotOptions options;

	/**
	 * 
	 */
	public Chart() {
		chartsdata = new ArrayList<PlotData>();
		options = new PlotOptions();
	}

	/**
	 * 
	 * @param chart TODO
	 */
	public void addElements(final PlotData chart) {
		chartsdata.add(chart);
	}

	/**
	 * 
	 * @param chart TODO
	 */
	public void addAllElements(List<PlotData> charts) {
		for (PlotData plotData : charts) {
			addElements(plotData);
		}
	}
	
	/**
	 * 
	 * @param xAxis TODO
	 */
	public void addXAxis(final Axis xAxis) {
		this.options.addXAxis(xAxis);
	}

	/**
	 * 
	 * @param yAxis TODO
	 */
	public void addYAxis(final Axis yAxis) {
		this.options.addYAxis(yAxis);
	}

	/**
	 * 
	 * @param grid TODO
	 */
	public void addGrid(final Grid grid) {
		this.options.setGrid(grid);
	}

	/**
	 * Helper method to use crosshair plugin.
	 * To use crosshair, add the following line to {@code <HEAD>}:
	 * <pre>
	 * {@code <script src="/path/to/flot/jquery.flot.crosshair.js" type="text/javascript" />}
	 * </pre>
	 * Adding the above script inclusion and calling this method will set the following options:
	 * <pre>
	 *   crosshair: {
	 *     mode: "x",
	 *     lineWidth: linkWidth
	 *     color: color
	 *   }
	 *   grid: {
	 *     hoverable: true,
	 *     autoHighlight: false
	 *   }
	 * </pre>
	 * @param lineWidth null or Integer number
	 * @param color null or String represented colour
	 */
	public void useCrossHair(final Integer lineWidth, final String color) {
		if (options.getCrosshair() == null) {
			CrossHair crosshair = new CrossHair();
			options.setCrosshair(crosshair);
		}
		options.getCrosshair().setMode("x");
		options.getCrosshair().setColor(color);
		options.getCrosshair().setLineWidth(lineWidth);

		if (options.getGrid() == null) {
			Grid grid = new Grid();
			options.setGrid(grid);
		}
		options.getGrid().setHoverable(true);
		options.getGrid().setAutoHighlight(false);
	}

	/**
	 * Helper method to use crosshair plugin.
	 * <p>
	 * To use crosshair, add the following line to {@code <HEAD>}:
	 * <pre>
	 * {@code <script src="/path/to/flot/jquery.flot.crosshair.js" type="text/javascript" />}
	 * </pre>
	 * Adding the above script inclusion and calling this method will set the following options:
	 * <pre>
	 *   crosshair: {
	 *     mode: "x"
	 *   }
	 *   grid: {
	 *     hoverable: true,
	 *     autoHighlight: false
	 *   }
	 * </pre>
	 */
	public void useCrossHair() {
		useCrossHair(null, null);
	}

	/**
	 * @return the options
	 */
	public PlotOptions getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(PlotOptions options) {
		this.options = options;
	}

	/**
	 * @return the chartsdata
	 */
	public ArrayList<PlotData> getChartsdata() {
		return chartsdata;
	}

	/**
	 * @param chartsdata the chartsdata to set
	 */
	public void setChartsdata(ArrayList<PlotData> chartsdata) {
		this.chartsdata = chartsdata;
	}
}
