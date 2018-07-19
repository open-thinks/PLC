package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.LocationsVw;
import com.openthinks.plc.core.model.LocationsVwExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;

public interface LocationsVwMapper {
    int countByExample(LocationsVwExample example);

    LocationsVw selectOneByExample(LocationsVwExample example);

    <T> List<LocationsVw> selectByExampleWithRowbounds(LocationsVwExample example, Page<T> rowBounds);

    List<LocationsVw> selectByExample(LocationsVwExample example);
}