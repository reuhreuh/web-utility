package net.rrworld.web.utility.navigation;

import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = 7999673143180910092L;
	private final String name;
	private final String href;

	/**
	 * 
	 * Build a new instance of Address.java.
	 * 
	 * @param name
	 * @param href
	 */
	public Address(final String name, final String href) {
		super();
		this.name = name;
		this.href = href;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the href
	 */
	public String getHref() {
		return href;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [name=" + name + ", href=" + href + "]";
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((href == null) ? 0 : href.hashCode());
		result = (prime * result) + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Address other = (Address) obj;
		if (href == null) {
			if (other.href != null) {
				return false;
			}
		} else if (!href.equals(other.href)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}
