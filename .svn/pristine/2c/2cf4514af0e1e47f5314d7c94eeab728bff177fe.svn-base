/**
 * 
 */
package com.openthinks.plc.core.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openthinks.plc.BizConstant;
import com.openthinks.plc.core.mapper.VehicleTrackMapper;
import com.openthinks.plc.core.model.VehicleTrack;
import com.openthinks.plc.core.service.VehicleService;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleTrackMapper vehicleTrackMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.openthinks.plc.core.service.VehicleService#makeNewTrack(com.openthinks.
	 * plc.core.model.VehicleTrack)
	 */
	@Override
	public boolean makeNewTrack(VehicleTrack track) {
		if (track.getTrackTime() == null) {
			track.setTrackTime(new Date());
		}
		if (track.getCoordType() == null) {
			track.setCoordType(BizConstant.CoordType.GCJ_02.value());
		}
		int rst = 0;
		try {
			rst = vehicleTrackMapper.insertSelective(track);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rst > 0;
	}

}
