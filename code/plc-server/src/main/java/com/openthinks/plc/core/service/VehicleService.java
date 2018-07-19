/**
 * 
 */
package com.openthinks.plc.core.service;

import java.util.List;

import com.openthinks.plc.core.model.VehicleTrack;
import com.openthinks.plc.core.model.VehicleTrackVw;

/**
 * @author dailey.yet@outlook.com
 *
 */
public interface VehicleService {

  /**
   * 添加新的车辆位置信息记录
   * 
   * @param track
   * @return
   */
  boolean makeNewTrack(VehicleTrack track);

  List<VehicleTrackVw> fetchLatestTrack();

}
