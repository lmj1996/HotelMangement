package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.StaffMapper;
import com.pojo.Staff;

@Service("staffService")
public class StaffService {
	@Resource
	private StaffMapper staffMapper;

	public Staff getSession(String staffNum, String staffPassword) {
		Staff staffInfo = staffMapper.getStaffInfo(staffNum);
		if(staffInfo!=null) {
			if(staffInfo.getStaffPassword().equals(staffPassword)) {
				return staffInfo;
			}
		}
		return null;
	}
	
	
	
}
