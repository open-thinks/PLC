/**
 * 
 */
package com.openthinks.plc.core.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openthinks.plc.BizConstant.PackStatus;
import com.openthinks.plc.core.mapper.PackTrackMapper;
import com.openthinks.plc.core.mapper.PacksMapper;
import com.openthinks.plc.core.mapper.PacksVwMapper;
import com.openthinks.plc.core.model.PackTrack;
import com.openthinks.plc.core.model.Packs;
import com.openthinks.plc.core.model.PacksExample;
import com.openthinks.plc.core.model.PacksVw;
import com.openthinks.plc.core.model.PacksVwExample;
import com.openthinks.plc.core.service.PackingService;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Service
public class PackingServiceImpl implements PackingService {

	@Autowired
	PacksVwMapper packsVwMapper;
	@Autowired
	PackTrackMapper packTrackMapper;
	@Autowired
	PacksMapper packsMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.openthinks.plc.core.service.PackingService#shipPacks(long,
	 * com.openthinks.plc.core.model.Packs[])
	 */
	@Override
	public boolean shipPacks(long shipId, Packs[] packSubmits) {
		boolean isSuccess = false;
		try {
			for (Packs pack : packSubmits) {
				if (!isExist(pack)) {
					createPack(pack);
				}
				if (isAvaiable(pack)) {
					PackTrack pc = new PackTrack();
					pc.setShipId(shipId);
					pc.setPackId(pack.getId());
					pc.setTrackDate(new Date());
					packTrackMapper.insertSelective(pc);
					pack.setPackStatus(PackStatus.SHIPPING.value());
					packsMapper.updateByPrimaryKeySelective(pack);
				}
			}
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	/**
	 * 是否可用的pack
	 * 
	 * @param pack
	 * @return
	 */
	@Override
	public boolean isAvaiable(Packs pack) {
		if (pack.getId() == null)
			return false;
		PacksExample example = new PacksExample();
		example.createCriteria().andIdEqualTo(pack.getId()).andPackStatusEqualTo(PackStatus.AVAIABLE.value());
		return packsMapper.countByExample(example) > 0;

	}

	/**
	 * 创建新的pack
	 * 
	 * @param pack
	 */
	@Override
	public void createPack(Packs pack) {
		pack.setPackStatus(PackStatus.AVAIABLE.value());
		pack.setCreateDate(new Date());
		packsMapper.insertSelective(pack);
	}

	/**
	 * 是否存在pack在数据库中
	 * 
	 * @param pack
	 * @return
	 */
	@Override
	public boolean isExist(Packs pack) {
		if (pack.getId() == null)
			return false;
		PacksExample example = new PacksExample();
		example.createCriteria().andIdEqualTo(pack.getId());
		return packsMapper.countByExample(example) > 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.openthinks.plc.core.service.PackingService#findPacksByStatus(com.
	 * openthinks.plc.BizConstant.PackStatus)
	 */
	@Override
	public List<PacksVw> findPacksByStatus(PackStatus packStatus) {
		PacksVwExample example = new PacksVwExample();
		if (packStatus != PackStatus.ALL) {
			example.createCriteria().andPackStatusEqualTo(packStatus.value());
		}
		return packsVwMapper.selectByExample(example);
	}

}
