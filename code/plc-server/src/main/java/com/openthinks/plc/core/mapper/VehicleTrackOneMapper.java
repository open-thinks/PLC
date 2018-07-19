package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.VehicleTrackOne;
import com.openthinks.plc.core.model.VehicleTrackOneExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;
import org.apache.ibatis.annotations.Param;

public interface VehicleTrackOneMapper {
    int countByExample(VehicleTrackOneExample example);

    int deleteByExample(VehicleTrackOneExample example);

    int deleteByPrimaryKey(Long vehicleId);

    int insert(VehicleTrackOne record);

    int insertSelective(VehicleTrackOne record);

    VehicleTrackOne selectOneByExample(VehicleTrackOneExample example);

    <T> List<VehicleTrackOne> selectByExampleWithRowbounds(VehicleTrackOneExample example, Page<T> rowBounds);

    List<VehicleTrackOne> selectByExample(VehicleTrackOneExample example);

    VehicleTrackOne selectByPrimaryKey(Long vehicleId);

    int updateByExampleSelective(@Param("record") VehicleTrackOne record, @Param("example") VehicleTrackOneExample example);

    int updateByExample(@Param("record") VehicleTrackOne record, @Param("example") VehicleTrackOneExample example);

    int updateByPrimaryKeySelective(VehicleTrackOne record);

    int updateByPrimaryKey(VehicleTrackOne record);
}