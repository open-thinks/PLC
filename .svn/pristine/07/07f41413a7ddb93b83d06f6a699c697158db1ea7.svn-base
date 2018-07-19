/**
 * 
 */
package com.openthinks.plc.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openthinks.plc.core.mapper.LocationsMapper;
import com.openthinks.plc.core.mapper.LocationsVwMapper;
import com.openthinks.plc.core.model.LocationsExample;
import com.openthinks.plc.core.model.LocationsVw;
import com.openthinks.plc.core.model.LocationsVwExample;
import com.openthinks.plc.core.service.LocationService;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	LocationsVwMapper locationsVwMapper;
	@Autowired
	LocationsMapper locationsMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.openthinks.plc.core.service.LocationService#findAllLocationsVw()
	 */
	@Override
	public List<LocationsVw> findAllLocationsVw() {
		LocationsVwExample example = new LocationsVwExample();
		return locationsVwMapper.selectByExample(example);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.openthinks.plc.core.service.LocationService#countAllLocations()
	 */
	@Override
	public int countAllLocations() {
		LocationsExample example = new LocationsExample();
		return locationsMapper.countByExample(example);
	}

}
