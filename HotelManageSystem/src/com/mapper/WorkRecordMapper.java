package com.mapper;

import com.pojo.WorkRecord;
import com.pojo.WorkRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkRecordMapper {
    int countByExample(WorkRecordExample example);

    int deleteByExample(WorkRecordExample example);

    int deleteByPrimaryKey(String workRecordId);

    int insert(WorkRecord record);

    int insertSelective(WorkRecord record);

    List<WorkRecord> selectByExample(WorkRecordExample example);

    WorkRecord selectByPrimaryKey(String workRecordId);

    int updateByExampleSelective(@Param("record") WorkRecord record, @Param("example") WorkRecordExample example);

    int updateByExample(@Param("record") WorkRecord record, @Param("example") WorkRecordExample example);

    int updateByPrimaryKeySelective(WorkRecord record);

    int updateByPrimaryKey(WorkRecord record);

	WorkRecord selectByStaffId(@Param("staffId") String staffId,@Param("date") String date);
}