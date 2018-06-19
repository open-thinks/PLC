/**
 * 
 */
package com.openthinks.plc.core.service;

import java.util.List;

import com.openthinks.plc.BizConstant.PackStatus;
import com.openthinks.plc.core.model.Packs;
import com.openthinks.plc.core.model.PacksVw;

/**
 * @author dailey.yet@outlook.com
 *
 */
public interface PackingService {

	/**
	 * 将包装绑定到运单批次上出库
	 * 
	 * @param shipId
	 * @param packSubmits
	 * @return
	 */
	boolean shipPacks(long shipId, Packs[] packSubmits);

	/**
	 * 根据包装状态查询包装信息列表
	 * 
	 * @param packStatus
	 * @return
	 */
	List<PacksVw> findPacksByStatus(PackStatus packStatus);

	/**
	 * 是否存在pack在数据库中
	 * 
	 * @param pack
	 * @return
	 */
	boolean isExist(Packs pack);

	/**
	 * 创建新的pack
	 * 
	 * @param pack
	 */
	void createPack(Packs pack);

	/**
	 * 是否可用的pack
	 * 
	 * @param pack
	 * @return
	 */
	boolean isAvaiable(Packs pack);

}
