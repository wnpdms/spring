package com.yedam.app.dep.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.dep.mapper.DepMapper;
import com.yedam.app.dep.service.DepService;
import com.yedam.app.dep.service.DepVO;

@Service
public class DepServiceImpl implements DepService {

	@Autowired
	DepMapper depMapper;
	
	@Override
	public List<DepVO> getDepAll() {
		return depMapper.getDepAll();
	}

	@Override
	public DepVO getDepInfo(DepVO depVO) {
		return depMapper.getDepInfo(depVO);
	}

	@Override
	public int insertDepInfo(DepVO depVO) {
		int result = depMapper.insertDepInfo(depVO);
		if (result == 1) {
			return depVO.getDepartmentId();
		}else {
			return -1;
		}
	}

}
