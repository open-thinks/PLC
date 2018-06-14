package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.Shippings;
import com.openthinks.plc.core.model.ShippingsExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;
import org.apache.ibatis.annotations.Param;

public interface ShippingsMapper {
    int countByExample(ShippingsExample example);

    int deleteByExample(ShippingsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Shippings record);

    int insertSelective(Shippings record);

    Shippings selectOneByExample(ShippingsExample example);

    <T> List<Shippings> selectByExampleWithRowbounds(ShippingsExample example, Page<T> rowBounds);

    List<Shippings> selectByExample(ShippingsExample example);

    Shippings selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Shippings record, @Param("example") ShippingsExample example);

    int updateByExample(@Param("record") Shippings record, @Param("example") ShippingsExample example);

    int updateByPrimaryKeySelective(Shippings record);

    int updateByPrimaryKey(Shippings record);
}