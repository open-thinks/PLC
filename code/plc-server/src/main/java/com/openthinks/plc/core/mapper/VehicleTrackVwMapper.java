package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.VehicleTrackVw;
import com.openthinks.plc.core.model.VehicleTrackVwExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;

public interface VehicleTrackVwMapper {
    int countByExample(VehicleTrackVwExample example);

    VehicleTrackVw selectOneByExample(VehicleTrackVwExample example);

    <T> List<VehicleTrackVw> selectByExampleWithRowbounds(VehicleTrackVwExample example, Page<T> rowBounds);

    List<VehicleTrackVw> selectByExample(VehicleTrackVwExample example);
}