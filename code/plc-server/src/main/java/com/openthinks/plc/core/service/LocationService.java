/**
 * 
 */
package com.openthinks.plc.core.service;

import java.util.List;

import com.openthinks.plc.core.model.LocationsVw;
import com.openthinks.plc.core.model.PacksVw;

/**
 * @author dailey.yet@outlook.com
 *
 */
public interface LocationService {

  /**
   * 查找所有的地址信息列表
   * 
   * @return
   */
  public List<LocationsVw> findAllLocationsVw();

  /**
   * 所有地址数量
   * 
   * @return
   */
  public int countAllLocations();


  public void calculatePackCount();


  public List<PacksVw> listInPacks(long locationId);

  public List<PacksVw> listOutPacks(long locationId);
}
