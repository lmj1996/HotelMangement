package com.mapper;

import com.pojo.Staff;
import com.pojo.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(String staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(String staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
    
    /**
     * 根据员工工号或者姓名或者联系电话查询员工信息
     * @return
     */
	Staff getStaffInfo(String staffNum);

	/**
	 * 根据身份证号查询员工信息
	 * @return
	 */
	Staff getStaffInfoByIDnum(String staffIdnumber);

	/**
	 * 获得编号最大值
	 * @return
	 */
	String getMaxNumber();
	
	/**
	 * 分页
	 */
	List<Staff> selectByExampleForPaging(StaffExample example);

	/**
	 * 根据电话号码获得信息
	 * @param phoneNumber
	 * @return
	 */
	Staff getStaffInfoByPhoneNumber(String phoneNumber);

	/**
	 * 除开特定ID的根据身份证号查询
	 */
	Staff getStaffInfoByIDnumExceptId(@Param("staffIdnumber") String staffIdnumber,@Param("staffId") String staffId);
	/**
	 * 除开特定ID的根据手机号查询
	 */
	Staff getStaffInfoByPhoneNumberExceptId(@Param("staffPhone") String staffPhone,@Param("staffId") String staffId);
}