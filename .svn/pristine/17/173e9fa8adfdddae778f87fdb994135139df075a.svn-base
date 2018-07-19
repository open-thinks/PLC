package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.Packs;
import com.openthinks.plc.core.model.PacksExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;
import org.apache.ibatis.annotations.Param;

public interface PacksMapper {
    int countByExample(PacksExample example);

    int deleteByExample(PacksExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Packs record);

    int insertSelective(Packs record);

    Packs selectOneByExample(PacksExample example);

    <T> List<Packs> selectByExampleWithRowbounds(PacksExample example, Page<T> rowBounds);

    List<Packs> selectByExample(PacksExample example);

    Packs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Packs record, @Param("example") PacksExample example);

    int updateByExample(@Param("record") Packs record, @Param("example") PacksExample example);

    int updateByPrimaryKeySelective(Packs record);

    int updateByPrimaryKey(Packs record);
}