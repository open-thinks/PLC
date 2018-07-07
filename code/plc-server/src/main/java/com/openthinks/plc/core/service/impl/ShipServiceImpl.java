/**
 * 
 */
package com.openthinks.plc.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openthinks.plc.BizConstant.ShipStatus;
import com.openthinks.plc.core.mapper.ShippingsVwMapper;
import com.openthinks.plc.core.model.ShippingsVw;
import com.openthinks.plc.core.model.ShippingsVwExample;
import com.openthinks.plc.core.service.ShipService;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Service
public class ShipServiceImpl implements ShipService {

	@Autowired
	ShippingsVwMapper shippingsVwMapper;
	/* (non-Javadoc)
	 * @see com.openthinks.plc.core.service.ShipService#findShipsByStatus(com.openthinks.plc.BizConstant.ShipStatus)
	 */
	@Override
	public List<ShippingsVw> findShipsByStatus(ShipStatus shipStatus) {
		ShippingsVwExample example = new ShippingsVwExample();
		if(shipStatus!=ShipStatus.ALL) {
			example.createCriteria().andShipStatusEqualTo(shipStatus.value());
		}
		return shippingsVwMapper.selectByExample(example);
	}

}
