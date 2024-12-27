/**
 * 
 */
package net.rrworld.web.utility.flot.options.plugins;

/**
 * Zoom. 
 *
 * @author LRI
 *
 */
public class Zoom {
	private Boolean interactive;
	public Zoom(final Boolean interactive) {
		super();
		this.interactive = interactive;
	}

	/**
	 * @return the interactive
	 */
	public Boolean getInteractive() {
		return interactive;
	}

	/**
	 * @param interactive the interactive to set
	 */
	public void setInteractive(Boolean interactive) {
		this.interactive = interactive;
	}
}
