package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DTO.StaffDTO;
import com.VO.StaffVO;
import com.mapper.*;
import com.pojo.*;
import com.pojo.StaffExample.Criteria;
import com.util.BuildUuid;
import com.util.TimeUtil;

@Service("staffService")
public class StaffService {
	@Resource
	private StaffMapper staffMapper;

	@Resource
	private PositionMapper positionMapper;

	// 登录判断
	public Staff getStaffInfo(String staffNum, String staffPassword) {
		Staff staffInfo = staffMapper.getStaffInfo(staffNum);
		if (staffInfo != null) {
			if (staffInfo.getStaffPassword().equals(staffPassword)) {
				return staffInfo;
			}
		}
		return null;
	}

	// 添加员工
	public String insertStaff(Staff staff) {
		String n = "ltjd-";
		Staff checkStaff = staffMapper.getStaffInfoByIDnum(staff.getStaffIdnumber());
		if (checkStaff != null) {
			return null;
		}
		String maxNumber = staffMapper.getMaxNumber();
		if (maxNumber != null && maxNumber.trim().length() > 0) {
			int nextNumber = Integer.parseInt(maxNumber);
			nextNumber = nextNumber + 1;
			String num = String.format("%04d", nextNumber);
			staff.setStaffNum(n + num);
		} else {
			staff.setStaffNum(n + "0001");
		}
		staff.setStaffId(BuildUuid.getUuid());
		staff.setStaffPassword("123");
		staff.setStaffEntrytime(TimeUtil.getStringDay());
		staff.setStaffCreatetime(TimeUtil.getStringSecond());
		staff.setStaffModifytime(TimeUtil.getStringSecond());
		staffMapper.insertSelective(staff);
		return "success";

	}

	// 获得所有员工信息（超级管理员除外）
	public StaffVO getAllStaffInfo(StaffVO staffVO) {
		List<StaffDTO> listStaffDTO = new ArrayList<>();
		List<Staff> listStaff = new ArrayList<>();

		StaffExample staffExample = new StaffExample();
		staffExample.setOrderByClause("staff_modifytime desc");
		staffExample.setStartRow((staffVO.getPageIndex() - 1) * staffVO.getPageSize());
		staffExample.setPageSize(staffVO.getPageSize());
		Criteria criteria = staffExample.createCriteria();
		criteria.andStaffIdNotEqualTo("1000001");
		Criteria criteria2 = staffExample.createCriteria();
		criteria2.andStaffIdNotEqualTo("1000001");
		if (staffVO.getSearch() != null && staffVO.getSearch().trim().length() > 0) {
			criteria.andStaffNumLike("%" + staffVO.getSearch() + "%");
			criteria2.andStaffNameLike("%" + staffVO.getSearch() + "%");
			staffExample.or(criteria2);
		}
		if (staffVO.getPosition() != null && staffVO.getPosition().trim().length() > 0) {
			criteria.andStaffPositionEqualTo(staffVO.getPosition());
		}

		int count = staffMapper.countByExample(staffExample);

		/**
		 * 设置总数量
		 */
		staffVO.setTotalRecords(count);
		/**
		 * 设置总页数
		 */
		staffVO.setTotalPages(((count - 1) / staffVO.getPageSize()) + 1);
		/**
		 * 判断是否拥有上一页
		 */
		if (staffVO.getPageIndex() <= 1) {
			staffVO.setHavePrePage(false);
		} else {
			staffVO.setHavePrePage(true);
		}
		/**
		 * 判断是否拥有下一页
		 */
		if (staffVO.getPageIndex() >= staffVO.getTotalPages()) {
			staffVO.setHaveNextPage(false);
		} else {
			staffVO.setHaveNextPage(true);
		}
		// 查询数据
		listStaff = staffMapper.selectByExampleForPaging(staffExample);
		if (listStaff != null) {
			for (Staff staff : listStaff) {
				StaffDTO staffDTO = new StaffDTO();
				Position position = positionMapper.selectByPrimaryKey(staff.getStaffPosition());
				staffDTO.setPosition(position);
				staffDTO.setStaff(staff);

				if (staffVO.getSearch() != null && staffVO.getSearch().trim().length() > 0) {
					staff.setStaffNum(staff.getStaffNum().replaceAll(staffVO.getSearch(),
							"<span style='color: #ff5063;'>" + staffVO.getSearch() + "</span>"));
					staff.setStaffName(staff.getStaffName().replaceAll(staffVO.getSearch(),
							"<span style='color: #ff5063;'>" + staffVO.getSearch() + "</span>"));
				}
				listStaffDTO.add(staffDTO);
			}
			staffVO.setListStaffDTO(listStaffDTO);
			return staffVO;
		}

		return null;
	}

	// 添加职位
	public void addPosition(Position position) {
		position.setPositionId(BuildUuid.getUuid());
		positionMapper.insertSelective(position);
	}

	// 获得所有职位
	public List<Position> getAllPosition() {
		PositionExample positionExample = new PositionExample();
		positionExample.setOrderByClause("position_level");
		com.pojo.PositionExample.Criteria criteria = positionExample.createCriteria();
		criteria.andPositionIdNotEqualTo("1000001");
		List<Position> list = positionMapper.selectByExample(positionExample);
		return list;
	}

	// 根据ID获得员工信息
	public Staff getStaffInfoById(String id) {
		Staff staff = staffMapper.selectByPrimaryKey(id);
		return staff;
	}

	// 更新员工信息
	public String updateStaffInfo(Staff staff) {
		Staff staffInfo = staffMapper.getStaffInfoByPhoneNumberExceptId(staff.getStaffPhone(), staff.getStaffId());
		if(staffInfo!=null) {
			return "phoneRepeat";
		}
		staff.setStaffModifytime(TimeUtil.getStringSecond());
		staffMapper.updateByPrimaryKeySelective(staff);
		return "updateStaff";
	}

	// 验证身份证号是否重复
	public String checkIDnumberIsRepeat(String iDnumber, String id) {
		Staff staffInfo = staffMapper.getStaffInfoByIDnumExceptId(iDnumber,id);
		if (staffInfo != null) {
			return "repeat";
		} else {
			return "notRepeat";
		}
	}

	// 验证电话号码是否重复
	public String checkPhoneNumberIsRepeat(String phoneNumber, String id) {
		Staff staffInfo = staffMapper.getStaffInfoByPhoneNumberExceptId(phoneNumber, id);
		if (staffInfo != null) {
			return "phoneRepeat";
		}
		return null;
	}

	// 根据编号获取员工信息
	public Staff getStaffInfoByNum(String currentUsername) {
		Staff staffInfo = staffMapper.getStaffInfo(currentUsername);
		return staffInfo;
	}

	

}
