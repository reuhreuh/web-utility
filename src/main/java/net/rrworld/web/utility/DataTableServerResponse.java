package net.rrworld.web.utility;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author SKA
 *
 */

public class DataTableServerResponse {
	
	
	final private List<List<String>> aaData = new ArrayList<List<String>>();
	

	
	
	/**
	 * 
	 */
	public DataTableServerResponse() {
		super();

	}




	public List<List<String>> getAaData() {
		return aaData;
	}

	public DataTableServerResponse build(final List<String> columnsValue){
		aaData.add(columnsValue);
		return this;
	}
	
	
	
}
