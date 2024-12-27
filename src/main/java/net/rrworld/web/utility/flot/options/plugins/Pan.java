/**
 * 
 */
package net.rrworld.web.utility.flot.options.plugins;

/**
 * Pan. 
 *
 * @author LRI
 *
 */
public class Pan {
	private Boolean interactive;
	public Pan(final Boolean interactive) {
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
