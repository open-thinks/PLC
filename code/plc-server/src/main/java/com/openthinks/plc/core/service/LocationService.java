/**
 * 
 */
package com.openthinks.plc.core.service;

import java.util.List;

import com.openthinks.plc.core.model.LocationsVw;

/**
 * @author dailey.yet@outlook.com
 *
 */
public interface LocationService {

	
	public List<LocationsVw> findAllLocationsVw();
		
	
	public int countAllLocations();
}
