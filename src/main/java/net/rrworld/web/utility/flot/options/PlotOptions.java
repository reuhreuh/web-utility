package net.rrworld.web.utility.flot.options;

import java.util.ArrayList;

import net.rrworld.web.utility.flot.options.plugins.CrossHair;
import net.rrworld.web.utility.flot.options.plugins.Pan;
import net.rrworld.web.utility.flot.options.plugins.Selection;
import net.rrworld.web.utility.flot.options.plugins.Zoom;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 */
@JsonInclude(Include.NON_NULL)
public class PlotOptions {
	/** */
	@JsonInclude(Include.NON_EMPTY)
	private ArrayList<Axis> xaxes;
	/** */
	@JsonInclude(Include.NON_EMPTY)
	private ArrayList<Axis> yaxes;
	/** */
	private Grid grid;
	/** */
	private Legend legend;
	/** */
	private Series series;
	/** */
	private CrossHair crosshair;
	/** */
	private Selection selection;
	
	private AxisLabels axisLabels;
	
	/**
	 * 
	 */
	private Zoom zoom;
	
	/**
	 * 
	 */
	private Pan pan;

	/**
	 *
	 */
	public PlotOptions() {
		xaxes = new ArrayList<Axis>();
		yaxes = new ArrayList<Axis>();
		axisLabels = new AxisLabels();
	}

	/**
	 * 
	 * @param xAxis
	 */
	public void addXAxis(final Axis xAxis) {
		this.xaxes.add(xAxis);
	}

	/**
	 * 
	 * @param yAxis
	 */
	public void addYAxis(final Axis yAxis) {
		this.yaxes.add(yAxis);
	}

	/**
	 * @return the xaxes
	 */
	public ArrayList<Axis> getXaxes() {
		return xaxes;
	}

	/**
	 * @param xaxes
	 *            the xaxes to set
	 */
	public void setXaxes(final ArrayList<Axis> xaxes) {
		this.xaxes = xaxes;
	}

	/**
	 * @return the yaxes
	 */
	public ArrayList<Axis> getYaxes() {
		return yaxes;
	}

	/**
	 * @param yaxes
	 *            the yaxes to set
	 */
	public void setYaxes(final ArrayList<Axis> yaxes) {
		this.yaxes = yaxes;
	}

	/**
	 * @return the legend
	 */
	public Legend getLegend() {
		return legend;
	}

	/**
	 * @param legend
	 *            the legend to set
	 */
	public void setLegend(final Legend legend) {
		this.legend = legend;
	}

	/**
	 * @return the crosshair
	 */
	public CrossHair getCrosshair() {
		return crosshair;
	}

	/**
	 * @param crosshair
	 *            the crosshair to set
	 */
	public void setCrosshair(final CrossHair crosshair) {
		this.crosshair = crosshair;
	}

	/**
	 * 
	 * @param grid
	 *            TODO
	 */
	public void setGrid(final Grid grid) {
		this.grid = grid;
	}

	/**
	 * 
	 * @param selection
	 *            TODO
	 */
	public void setSelection(final Selection selection) {
		this.selection = selection;
	}

	/**
	 * 
	 * @return TODO
	 */
	public Grid getGrid() {
		return this.grid;
	}

	/**
	 * @return the selection
	 */
	public Selection getSelection() {
		return selection;
	}

	/**
	 * @return the series
	 */
	public Series getSeries() {
		return series;
	}

	/**
	 * @param series
	 *            the series to set
	 */
	public void setSeries(final Series series) {
		this.series = series;
	}

	/**
	 * @return the zoom
	 */
	public Zoom getZoom() {
		return zoom;
	}

	/**
	 * @param zoom the zoom to set
	 */
	public void setZoom(Zoom zoom) {
		this.zoom = zoom;
	}

	/**
	 * @return the pan
	 */
	public Pan getPan() {
		return pan;
	}

	/**
	 * @param pan the pan to set
	 */
	public void setPan(Pan pan) {
		this.pan = pan;
	}

	/**
	 * @return the axisLabels
	 */
	public AxisLabels getAxisLabels() {
		return axisLabels;
	}

	/**
	 * @param axisLabels the axisLabels to set
	 */
	public void setAxisLabels(AxisLabels axisLabels) {
		this.axisLabels = axisLabels;
	}
}
