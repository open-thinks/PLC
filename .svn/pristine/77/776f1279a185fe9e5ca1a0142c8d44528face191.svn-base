package com.openthinks.plc.core.mapper;

import com.openthinks.plc.core.model.PackTrack;
import com.openthinks.plc.core.model.PackTrackExample;
import java.util.List;
import net.sourceforge.orm.mybatis.Page;
import org.apache.ibatis.annotations.Param;

public interface PackTrackMapper {
    int countByExample(PackTrackExample example);

    int deleteByExample(PackTrackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PackTrack record);

    int insertSelective(PackTrack record);

    PackTrack selectOneByExample(PackTrackExample example);

    <T> List<PackTrack> selectByExampleWithRowbounds(PackTrackExample example, Page<T> rowBounds);

    List<PackTrack> selectByExample(PackTrackExample example);

    PackTrack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PackTrack record, @Param("example") PackTrackExample example);

    int updateByExample(@Param("record") PackTrack record, @Param("example") PackTrackExample example);

    int updateByPrimaryKeySelective(PackTrack record);

    int updateByPrimaryKey(PackTrack record);
}