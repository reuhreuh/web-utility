package net.rrworld.web.utility.navigation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * this component manage the application's navigation.
 * 
 * BreadCrumbs.
 * 
 * @author SKA
 * 
 */

public class BreadCrumbs implements Iterable<Address>, Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = 1832395039240038361L;
	private final List<Address> listUrl = new ArrayList<Address>();

	/**
	 * @return the listUrl
	 */
	public List<Address> getListUrl() {
		return listUrl;
	}

	/**
	 * 
	 * Build a new instance of BreadCrumbs.java.
	 */
	public BreadCrumbs() {
		super();
	}

	/**
	 * clean the Bread crumbs
	 */
	public void clear() {
		listUrl.clear();
	}

	/**
	 * push a new address
	 * 
	 * @param address
	 */
	public BreadCrumbs push(final Address address) {
		listUrl.add(address);

		return this;
	}

	/**
	 * 
	 * @return the current instance of BreadCrumbs
	 */
	public BreadCrumbs pop() {
		if (listUrl.size() > 0) {
			listUrl.remove(listUrl.size() - 1);
		}

		return this;
	}

	/**
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	public Iterator<Address> iterator() {
		return this.listUrl.iterator();
	}

	public int getSize() {
		return listUrl.size();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BreadCrumbs [listUrl=" + listUrl + "]";
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((listUrl == null) ? 0 : listUrl.hashCode());
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
		final BreadCrumbs other = (BreadCrumbs) obj;
		if (listUrl == null) {
			if (other.listUrl != null) {
				return false;
			}
		} else if (!listUrl.equals(other.listUrl)) {
			return false;
		}
		return true;
	}
}
