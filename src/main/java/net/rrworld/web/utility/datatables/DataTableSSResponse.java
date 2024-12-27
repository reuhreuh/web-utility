/**
 * 
 */
package net.rrworld.web.utility.datatables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * DataTableSSAnswer is a Server Side answer to JSONify in order to fetch DataTable ajax loading
 *
 * @author LRI
 *
 */
@JsonInclude(Include.NON_NULL)
public class DataTableSSResponse<T> implements Serializable {

	/**
	 * serialVersionUID:long
	 */
	private static final long serialVersionUID = 7795273657287152524L;
	private Long recordsTotal;
	private Long recordsFiltered;
	private Integer draw;
	private List<T> data = new ArrayList<T>();
	
	/**
	 * Build a new instance of DataTableSSResponse.java.
	 */
	public DataTableSSResponse() {
		super();
	}
	/**
	 * @return the recordsTotal
	 */
	public Long getRecordsTotal() {
		return recordsTotal;
	}
	/**
	 * @param recordsTotal the recordsTotal to set
	 */
	public void setRecordsTotal(Long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	/**
	 * @return the recordsFiltered
	 */
	public Long getRecordsFiltered() {
		return recordsFiltered;
	}
	/**
	 * @param recordsFiltered the recordsFiltered to set
	 */
	public void setRecordsFiltered(Long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	/**
	 * @return the draw
	 */
	public Integer getDraw() {
		return draw;
	}
	/**
	 * @param draw the draw to set
	 */
	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<T> data) {
		this.data = data;
	}
}
