package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.Vehicles;
import com.openthinks.plc.core.model.VehiclesExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;
import org.apache.ibatis.annotations.Param;

public interface VehiclesMapper {
    int countByExample(VehiclesExample example);

    int deleteByExample(VehiclesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Vehicles record);

    int insertSelective(Vehicles record);

    Vehicles selectOneByExample(VehiclesExample example);

    <T> List<Vehicles> selectByExampleWithRowbounds(VehiclesExample example, Page<T> rowBounds);

    List<Vehicles> selectByExample(VehiclesExample example);

    Vehicles selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Vehicles record, @Param("example") VehiclesExample example);

    int updateByExample(@Param("record") Vehicles record, @Param("example") VehiclesExample example);

    int updateByPrimaryKeySelective(Vehicles record);

    int updateByPrimaryKey(Vehicles record);
}