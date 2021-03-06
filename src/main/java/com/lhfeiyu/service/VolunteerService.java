package com.lhfeiyu.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.lhfeiyu.dao.NurseMapper;
import com.lhfeiyu.dao.VolunteerMapper;
import com.lhfeiyu.po.Hospital;
import com.lhfeiyu.po.Nurse;
import com.lhfeiyu.po.Volunteer;
import com.lhfeiyu.util.Md5Util;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-Nurse <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class VolunteerService extends CommonService<Volunteer> {

	@Autowired
	VolunteerMapper volunteermapper;

	public void updateDeletedNowById(Integer volunteerId) {
		// TODO Auto-generated method stub
		volunteermapper.updateDeletedNowById(volunteerId);
	}

	public void insertService(Volunteer nurse) {
		// TODO Auto-generated method stub
		volunteermapper.insertService(nurse);
	}

	public void updateService(Volunteer nurse) {
		// TODO Auto-generated method stub
		volunteermapper.updateService(nurse);
	}
	
}