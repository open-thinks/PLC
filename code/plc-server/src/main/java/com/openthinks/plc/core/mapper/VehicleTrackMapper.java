package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.VehicleTrack;
import com.openthinks.plc.core.model.VehicleTrackExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;
import org.apache.ibatis.annotations.Param;

public interface VehicleTrackMapper {
    int countByExample(VehicleTrackExample example);

    int deleteByExample(VehicleTrackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VehicleTrack record);

    int insertSelective(VehicleTrack record);

    VehicleTrack selectOneByExample(VehicleTrackExample example);

    <T> List<VehicleTrack> selectByExampleWithRowbounds(VehicleTrackExample example, Page<T> rowBounds);

    List<VehicleTrack> selectByExample(VehicleTrackExample example);

    VehicleTrack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VehicleTrack record, @Param("example") VehicleTrackExample example);

    int updateByExample(@Param("record") VehicleTrack record, @Param("example") VehicleTrackExample example);

    int updateByPrimaryKeySelective(VehicleTrack record);

    int updateByPrimaryKey(VehicleTrack record);
}