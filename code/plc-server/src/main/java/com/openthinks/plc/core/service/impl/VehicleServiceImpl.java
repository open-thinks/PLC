/**
 * 
 */
package com.openthinks.plc.core.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openthinks.plc.BizConstant;
import com.openthinks.plc.core.mapper.VehicleTrackMapper;
import com.openthinks.plc.core.mapper.VehicleTrackOneMapper;
import com.openthinks.plc.core.mapper.VehicleTrackVwMapper;
import com.openthinks.plc.core.model.VehicleTrack;
import com.openthinks.plc.core.model.VehicleTrackOne;
import com.openthinks.plc.core.model.VehicleTrackOneExample;
import com.openthinks.plc.core.model.VehicleTrackVw;
import com.openthinks.plc.core.model.VehicleTrackVwExample;
import com.openthinks.plc.core.service.VehicleService;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Service
public class VehicleServiceImpl implements VehicleService {
  @Autowired
  VehicleTrackMapper vehicleTrackMapper;
  @Autowired
  VehicleTrackOneMapper vehicleTrackOneMapper;
  @Autowired
  VehicleTrackVwMapper vehicleTrackVwMapper;

  /*
   * (non-Javadoc)
   * 
   * @see com.openthinks.plc.core.service.VehicleService#makeNewTrack(com.openthinks.
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
    if (track.getTrackTime() == null) {
      track.setTrackTime(new Date());
    }
    try {
      rst = vehicleTrackMapper.insertSelective(track);
      saveVehicleTrackOne(track);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return rst > 0;
  }

  private void saveVehicleTrackOne(VehicleTrack track) {
    VehicleTrackOne trackOne = new VehicleTrackOne.Builder().vehicleId(track.getVehicleId())
        .coordType(track.getCoordType()).latitude(track.getLatitude())
        .longitude(track.getLongitude()).trackTime(track.getTrackTime()).yali(track.getYali())
        .temp(track.getTemp()).doorState(track.getDoorState()).shidu(track.getShidu()).build();

    VehicleTrackOneExample example = new VehicleTrackOneExample();
    example.createCriteria().andVehicleIdEqualTo(track.getVehicleId());
    int count = vehicleTrackOneMapper.countByExample(example);
    if (count > 0) {
      vehicleTrackOneMapper.updateByPrimaryKeySelective(trackOne);
    } else {
      vehicleTrackOneMapper.insertSelective(trackOne);
    }

  }

  @Override
  public List<VehicleTrackVw> fetchLatestTrack() {
    VehicleTrackVwExample example = new VehicleTrackVwExample();
    return vehicleTrackVwMapper.selectByExample(example);
  }

}
