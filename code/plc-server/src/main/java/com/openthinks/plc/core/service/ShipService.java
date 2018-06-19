/**
 * 
 */
package com.openthinks.plc.core.service;

import java.util.List;

import com.openthinks.plc.BizConstant.ShipStatus;
import com.openthinks.plc.core.model.ShippingsVw;

/**
 * @author dailey.yet@outlook.com
 *
 */
public interface ShipService {

	/**
	 * 通过运单状态 查找运单信息列表
	 * @param shipStatus
	 * @return
	 */
	List<ShippingsVw> findShipsByStatus(ShipStatus shipStatus);

}
