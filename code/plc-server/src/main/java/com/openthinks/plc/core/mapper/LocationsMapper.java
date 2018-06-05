package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.Locations;
import com.openthinks.plc.core.model.LocationsExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;
import org.apache.ibatis.annotations.Param;

public interface LocationsMapper {
    int countByExample(LocationsExample example);

    int deleteByExample(LocationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Locations record);

    int insertSelective(Locations record);

    Locations selectOneByExample(LocationsExample example);

    <T> List<Locations> selectByExampleWithRowbounds(LocationsExample example, Page<T> rowBounds);

    List<Locations> selectByExample(LocationsExample example);

    Locations selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Locations record, @Param("example") LocationsExample example);

    int updateByExample(@Param("record") Locations record, @Param("example") LocationsExample example);

    int updateByPrimaryKeySelective(Locations record);

    int updateByPrimaryKey(Locations record);
}