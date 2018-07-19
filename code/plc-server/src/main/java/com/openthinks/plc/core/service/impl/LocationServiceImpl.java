/**
 * 
 */
package com.openthinks.plc.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openthinks.plc.core.mapper.LocationsMapper;
import com.openthinks.plc.core.mapper.LocationsVwMapper;
import com.openthinks.plc.core.mapper.PackTrackMapper;
import com.openthinks.plc.core.mapper.PacksVwMapper;
import com.openthinks.plc.core.mapper.ShippingsMapper;
import com.openthinks.plc.core.model.LocationsExample;
import com.openthinks.plc.core.model.LocationsVw;
import com.openthinks.plc.core.model.LocationsVwExample;
import com.openthinks.plc.core.model.PackTrackExample;
import com.openthinks.plc.core.model.PacksVw;
import com.openthinks.plc.core.model.PacksVwExample;
import com.openthinks.plc.core.model.Shippings;
import com.openthinks.plc.core.model.ShippingsExample;
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
  @Autowired
  PacksVwMapper packsVwMapper;
  @Autowired
  PackTrackMapper packTrackMapper;
  @Autowired
  ShippingsMapper shippingsMapper;

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

  @Override
  public void calculatePackCount() {


  }

  @Override
  public List<PacksVw> listInPacks(long locationId) {
    ShippingsExample example = new ShippingsExample();
    example.createCriteria().andToIdEqualTo(locationId).andShipStatusEqualTo((byte) 2);
    List<Shippings> ships = shippingsMapper.selectByExample(example);
    List<PacksVw> packs = new ArrayList<PacksVw>();
    for (Shippings ship : ships) {
      PackTrackExample example1 = new PackTrackExample();
      example1.createCriteria().andShipIdEqualTo(ship.getId());
      packTrackMapper.selectByExample(example1).forEach((pt -> {
        PacksVwExample example2 = new PacksVwExample();
        example2.createCriteria().andIdEqualTo(pt.getPackId());
        PacksVw pv = packsVwMapper.selectOneByExample(example2);
        if (pv != null)
          packs.add(pv);
      }));
    }
    return packs;
  }

  @Override
  public List<PacksVw> listOutPacks(long locationId) {
    ShippingsExample example = new ShippingsExample();
    example.createCriteria().andFromIdEqualTo(locationId).andShipStatusBetween((byte) 1, (byte) 2);
    List<Shippings> ships = shippingsMapper.selectByExample(example);
    List<PacksVw> packs = new ArrayList<PacksVw>();
    for (Shippings ship : ships) {
      PackTrackExample example1 = new PackTrackExample();
      example1.createCriteria().andShipIdEqualTo(ship.getId());
      packTrackMapper.selectByExample(example1).forEach((pt -> {
        PacksVwExample example2 = new PacksVwExample();
        example2.createCriteria().andIdEqualTo(pt.getPackId());
        PacksVw pv = packsVwMapper.selectOneByExample(example2);
        if (pv != null)
          packs.add(pv);
      }));
    }
    return packs;
  }

}
