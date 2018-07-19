package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.ShippingsVw;
import com.openthinks.plc.core.model.ShippingsVwExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;

public interface ShippingsVwMapper {
    int countByExample(ShippingsVwExample example);

    ShippingsVw selectOneByExample(ShippingsVwExample example);

    <T> List<ShippingsVw> selectByExampleWithRowbounds(ShippingsVwExample example, Page<T> rowBounds);

    List<ShippingsVw> selectByExample(ShippingsVwExample example);
}